import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class GroupBuyDaoJdbcTemplate implements GroupBuyDao {
    private JdbcTemplate jdbcTemplate;

    public GroupBuyDaoJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> findAllUsers() {
        String sql = "select userId, username, password, level from user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void addUser(User user) {
        String sql = "insert into user(username, password, level) values(?, ?, ?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getLevel());
    }

    @Override
    public Boolean updateUserPassword(Integer userId, String newPassword) {
        String sql = "update user set password = ? where userId = ?";
        int rowcount = jdbcTemplate.update(sql, newPassword, userId);
        return rowcount == 1;
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        String sql = "select userId, username, password, level from user where username = ?";
        try {
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);
            return Optional.ofNullable(user);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<User> findUserById(Integer userId) {
        String sql = "select userId, username, password, level from user where userId = ?";
        try {
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), userId);
            return Optional.ofNullable(user);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    // ... 其他方法 ...

    @Override
    public List<Product> findAllProducts() {
        String sql = "select productId, productName, price, unit, isLaunch from product";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class));
    }

    @Override
    public Optional<Product> findProductById(Integer productId) {
        String sql = "select productId, productName, price, unit, isLaunch from product where productId = ?";
        try {
            Product product = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Product.class), productId);
            return Optional.ofNullable(product);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public void addProduct(Product product) {
        String sql = "insert into product(productName, price, unit, isLaunch) values(?, ?, ?, ?)";
        jdbcTemplate.update(sql, product.getProductName(), product.getPrice(), product.getUnit(), product.getIsLaunch());
    }

    @Override
    public Boolean updateProductLaunch(Integer productId, Boolean isLaunch) {
        String sql = "update product set isLaunch = ? where productId = ?";
        int rowcount = jdbcTemplate.update(sql, isLaunch, productId);
        return rowcount == 1;
    }

    @Override
    public void addCart(Cart cart) {
        String sql = "insert into cart(userId, isCheckout) values(?, ?)";
        jdbcTemplate.update(sql, cart.getUserId(), cart.getIsCheckout());
    }

    @Override
    public void addCartItem(CartItem cartItem) {
        String sql = "insert into cartitem(cartId, productId, quantity) values(?, ?, ?)";
        jdbcTemplate.update(sql, cartItem.getCartId(), cartItem.getProductId(), cartItem.getQuantity());
    }

    @Override
    public List<Cart> findAllCart() {
        // 第一次查詢：獲取所有購物車
        String sqlCarts = "select cartId, userId, isCheckout, checkoutTime from cart";
        List<Cart> carts = jdbcTemplate.query(sqlCarts, new BeanPropertyRowMapper<>(Cart.class));

        // 第二次查詢：獲取所有購物車項目及其對應的產品
        String sqlItems = "SELECT ci.itemId, ci.cartId, ci.quantity, " +
                          "p.productId, p.productName, p.price, p.unit, p.isLaunch " +
                          "FROM cartitem ci " +
                          "JOIN product p ON ci.productId = p.productId";
        List<CartItem> cartItems = jdbcTemplate.query(sqlItems, new CartItemProductRowMapper());

        // 將購物車項目按 cartId 分組
        Map<Integer, List<CartItem>> cartItemsMap = cartItems.stream()
            .collect(Collectors.groupingBy(CartItem::getCartId));

        // 給每個購物車分配對應的購物車項目
        carts.forEach(cart -> cart.setCartItems(cartItemsMap.getOrDefault(cart.getCartId(), new ArrayList<>())));

        return carts;
    }

    private class CartItemProductRowMapper implements RowMapper<CartItem> {
        @Override
        public CartItem mapRow(ResultSet rs, int rowNum) throws SQLException {
            CartItem cartItem = new CartItem();
            cartItem.setItemId(rs.getInt("itemId"));
            cartItem.setCartId(rs.getInt("cartId"));
            cartItem.setQuantity(rs.getInt("quantity"));

            Product product = new Product();
            product.setProductId(rs.getInt("productId"));
            product.setProductName(rs.getString("productName"));
            product.setPrice(rs.getDouble("price"));
            product.setUnit(rs.getString("unit"));
            product.setIsLaunch(rs.getBoolean("isLaunch"));

            cartItem.setProduct(product);

            return cartItem;
        }
    }

    @Override
    public Optional<Cart> findCartById(Integer cartId) {
        try {
            // 查詢並獲取特定的購物車
            String sqlCart = "SELECT cartId, userId, isCheckout, checkoutTime FROM cart WHERE cartId = ?";
            Cart cart = jdbcTemplate.queryForObject(sqlCart, new BeanPropertyRowMapper<>(Cart.class), cartId);

            // 查詢與該購物車相關聯的所有購物車項目及其對應的產品
            String sqlItems = "SELECT ci.itemId, ci.cartId, ci.quantity, " +
                              "p.productId, p.productName, p.price, p.unit, p.isLaunch " +
                              "FROM cartitem ci " +
                              "JOIN product p ON ci.productId = p.productId WHERE ci.cartId = ?";
            List<CartItem> cartItems = jdbcTemplate.query(sqlItems, new CartItemProductRowMapper(), cartId);

            // 將購物車項目列表設置到購物車對象中
            cart.setCartItems(cartItems);

            return Optional.of(cart);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Cart> findCartsByUserId(Integer userId) {
        String sql = "select cartId, userId, isCheckout, checkoutTime from cart where userId = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Cart.class), userId);
    }

    @Override
    public List<Cart> findCartsbyUserIdAndCheckoutStatus(Integer userId, Boolean isCheckout) {
        String sql = "select cartId, userId, isCheckout, checkoutTime from cart where userId = ? and isCheckout = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Cart.class), userId, isCheckout);
    }

    @Override
    public Optional<Cart> findNoneCheckoutCartByUserId(Integer userId) {
        String sql = "select cartId, userId, isCheckout, checkoutTime from cart where userId = ? and (isCheckout = false or isCheckout is null)";
        try {
            Cart cart = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Cart.class), userId);
            return Optional.ofNullable(cart);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public Boolean checkoutCartByUserId(Integer userId) {
        String sql = "update cart set isCheckout = true where userId = ? and (isCheckout = false or isCheckout is null)";
        int rowcount = jdbcTemplate.update(sql, userId);
        return rowcount > 0;
    }

    @Override
    public Boolean checkoutCartById(Integer cartId) {
        String sql = "update cart set isCheckout = true where cartId = ? and (isCheckout = false or isCheckout is null)";
        int rowcount = jdbcTemplate.update(sql, cartId);
        return rowcount == 1;
    }

    @Override
    public Boolean removeCartItemById(Integer cartItemId) {
        String sql = "delete from cartitem where itemId = ?";
        int rowcount = jdbcTemplate.update(sql, cartItemId);
        return rowcount == 1;
    }

    @Override
    public Boolean updateCartItemQuantity(Integer cartItemId, Integer quantity) {
        String sql = "update cartitem set quantity = ? where itemId = ?";
        int rowcount = jdbcTemplate.update(sql, quantity, cartItemId);
        return rowcount == 1;
    }
}
