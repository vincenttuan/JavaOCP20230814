package day25.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.print.attribute.PrintServiceAttribute;

import day25.entity.Cart;
import day25.entity.CartItem;
import day25.entity.Product;
import day25.entity.User;

public class GroupBuyDaoMySQL implements GroupBuyDao {
	private static GroupBuyDao _instance = new GroupBuyDaoMySQL();
	private Connection conn;
	
	private GroupBuyDaoMySQL() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/group_buy", "root", "12345678");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		conn.close();
	}
	
	public static GroupBuyDao getInstance() {
		return _instance;
	}
	
	@Override
	public List<User> findAllUsers() {
		String sql = "select userId, username, password, level from user";
		List<User> users = new ArrayList<>();
		
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				User user = new User(
						rs.getInt("userId"), 
						rs.getString("username"), 
						rs.getString("password"), 
						rs.getInt("level"));
				users.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public void addUser(User user) {
		String sql = "insert into user(username, password, level) values(?, ?, ?)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setInt(3, user.getLevel());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Boolean updateUserPassword(Integer userId, String newPassword) {
		Optional<User> userOpt = findUserById(userId);
		if(userOpt.isEmpty()) {
			return false;
		}
		String sql = "update user set password = ? where userId = ?";
		int rowcount = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, newPassword);
			pstmt.setInt(2, userId);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return rowcount == 1;
	}

	@Override
	public Optional<User> findUserByUsername(String username) {
		String sql = "select userId, username, password, level from user where username = ?";
		User user = null;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, username);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					user = new User(
							rs.getInt("userId"), 
							rs.getString("username"), 
							rs.getString("password"), 
							rs.getInt("level"));  
				}
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(user);
	}

	@Override
	public Optional<User> findUserById(Integer userId) {
		//return findAllUsers().stream().filter(user -> user.getUserId().equals(userId)).findAny();
		String sql = "select userId, username, password, level from user where userId = ?";
		User user = null;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, userId);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					user = new User(
							rs.getInt("userId"), 
							rs.getString("username"), 
							rs.getString("password"), 
							rs.getInt("level"));  
				}
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(user);
	}

	@Override
	public List<Product> findAllProducts() {
		String sql = "select productId, productName, price, unit, isLaunch from product";
		List<Product> products = new ArrayList<>();
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				products.add(new Product(
						rs.getInt("productId"), 
						rs.getString("productName"), 
						rs.getInt("price"), 
						rs.getString("unit"), 
						rs.getBoolean("isLaunch")));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public Optional<Product> findProductById(Integer productId) {
		String sql = "select productId, productName, price, unit, isLaunch from product where productId = ?";
		Product product = null;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, productId);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					product = new Product(
							rs.getInt("productId"), 
							rs.getString("productName"), 
							rs.getInt("price"), 
							rs.getString("unit"), 
							rs.getBoolean("isLaunch"));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(product);
	}

	@Override
	public void addProduct(Product product) {
		String sql = "insert into product(productName, price, unit, isLaunch) values(?, ?, ? ,?)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getUnit());
			pstmt.setBoolean(4, product.getIsLaunch());
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}  
	}

	@Override
	public Boolean updateProductLaunch(Integer productId, Boolean isLaunch) {
		Optional<Product> productOpt = findProductById(productId);
		if(productOpt.isEmpty()) {
			return false;
		}
		String sql = "update product set isLaunch = ? where productId = ?";
		int rowcount = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setBoolean(1, isLaunch);
			pstmt.setInt(2, productId);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rowcount == 1;
	}

	@Override
	public void addCart(Cart cart) {
		String sql = "insert into cart(userId, isCheckout) values(?, ?)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cart.getUserId());
			pstmt.setBoolean(2, cart.getIsCheckout());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addCartItem(CartItem cartItem) {
		String sql = "insert into cartitem(cartId, productId, quantity) values(?, ?, ?)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cartItem.getCartId());
			pstmt.setInt(2, cartItem.getProductId());
			pstmt.setInt(3, cartItem.getQuantity());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Cart> findAllCart() {
		String sql = "select cartId, userId, isCheckout, checkoutTime from cart";
		List<Cart> carts = new ArrayList<>();
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			while(rs.next()) {
				carts.add(new Cart(
						rs.getInt("cartId"), 
						rs.getInt("userId"),
						rs.getBoolean("isCheckout"),
						rs.getDate("checkoutTime")));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return carts;
	}

	@Override
	public Optional<Cart> findCartById(Integer cartId) {
		String sql = "select cartId, userId, isCheckout, checkoutTime from cart where cartId = ?";
		Cart cart = null;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cartId);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				
				if(rs.next()) {
					cart = new Cart(
							rs.getInt("cartId"), 
							rs.getInt("userId"),
							rs.getBoolean("isCheckout"),
							rs.getDate("checkoutTime"));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(cart);
	}

	@Override
	public Optional<CartItem> findCartItemById(Integer itemId) {
		String sql = "select itemId, cartId, productId, quantity from CartItem where itemId = ?";
		CartItem cartItem = null;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, itemId);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					cartItem = new CartItem(
							rs.getInt("itemId"),
							rs.getInt("cartId"),
							rs.getInt("productId"),
							rs.getInt("quantity"));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(cartItem);
	}

	@Override
	public List<Cart> findCartsByUserId(Integer userId) {
		String sql = "select cartId, userId, isCheckout, checkoutTime from Cart where userId = ?";
		List<Cart> carts = new ArrayList<>();
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, userId);
			
			try(ResultSet rs = pstmt.executeQuery()) {
			
				while (rs.next()) {
					carts.add(new Cart(
							rs.getInt("cartId"), 
							rs.getInt("userId"),
							rs.getBoolean("isCheckout"),
							rs.getDate("checkoutTime")));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return carts;
	}

	@Override
	public List<Cart> findCartsbyUserIdAndCheckoutStatus(Integer userId, Boolean isCheckout) {
		String sql = "select cartId, userId, isCheckout, checkoutTime from Cart where userId = ? and isCheckout = ?";
		List<Cart> carts = new ArrayList<>();
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, userId);
			pstmt.setBoolean(2, isCheckout);
			
			try(ResultSet rs = pstmt.executeQuery()) {
			
				while (rs.next()) {
					carts.add(new Cart(
							rs.getInt("cartId"), 
							rs.getInt("userId"),
							rs.getBoolean("isCheckout"),
							rs.getDate("checkoutTime")));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return carts;
	}

	@Override
	public Optional<Cart> findNoneCheckoutCartByUserId(Integer userId) {
		String sql = "select cartId, userId, isCheckout, checkoutTime from cart where userId = ? and (isCheckout = false or isCheckout is null)";
		Cart cart = null;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, userId);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				
				if(rs.next()) {
					cart = new Cart(
							rs.getInt("cartId"), 
							rs.getInt("userId"),
							rs.getBoolean("isCheckout"),
							rs.getDate("checkoutTime"));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(cart);
	}

	@Override
	public Boolean checkoutCartByUserId(Integer userId) {
		
		if(findCartsByUserId(userId).isEmpty()) {
			return false;
		}
		
		String sql = "update cart set isCheckout = true where userId = ? and (isCheckout = false or isCheckout is null)";
		int rowcount = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, userId);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowcount == 1;
	}

	@Override
	public Boolean checkoutCartById(Integer cartId) {
		if(findCartById(cartId).isEmpty()) {
			return false;
		}
		String sql = "update cart set isCheckout = true where cartId = ? and (isCheckout = false or isCheckout is null)";
		int rowcount = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cartId);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowcount == 1;
	}

	@Override
	public Boolean removeCartItemById(Integer cartItemId) {
		String sql = "delete from CartItem where itemId = ?";
		int rowcount = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cartItemId);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowcount == 1;
	}

	@Override
	public Boolean updateCartItemQuantity(Integer cartItemId, Integer quantity) {
		if(findCartItemById(cartItemId).isEmpty()) {
			return false;
		}
		String sql = "update CartItem set quantity = ? where itemId = ?";
		int rowcount = 0;
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, quantity);
			pstmt.setInt(2, cartItemId);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowcount == 1;
	}
	
}
