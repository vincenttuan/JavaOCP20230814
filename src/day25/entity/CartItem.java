package day25.entity;

/**
4. 購物車明細檔(Detail)
+--------+----------+-----------+------------+
| itemId |  cartId  | productId |  quantity  |
+--------+----------+-----------+------------+
|   1    |   201    |    501    |     10     |
|   2    |   201    |    502    |     8      |
|   3    |   202    |    503    |     5      |
|   4    |   203    |    502    |     8      |
|   5    |   203    |    504    |     20     |
|   6    |   205    |    505    |     15     |
+--------+----------+-----------+------------+
 * */
public class CartItem {
	private Integer itemId; // 購物車明細 Id
	private Integer cartId; // 購物車 Id
	private Cart cart; // 購物車物件
	private Integer productId; // 商品 Id
	private Product product; // 商品物件
	private Integer quantity; // 數量
	
	public CartItem() {
		
	}
	
	public CartItem(Integer itemId, Integer cartId, Integer productId, Integer quantity) {
		this.itemId = itemId;
		this.cartId = cartId;
		this.productId = productId;
		this.quantity = quantity;
		
		// 根據 productId 找到 Product 物件
		// 根據 cartId 找到 Cart 物件
	}
	
	
	
}
