package day25.entity;

import java.util.Date;
import java.util.List;

/**
3. 購物車主檔(Master)
+--------+----------+-----------+------------+--------------+
| cartId |  userId  | cartItems | isCheckout | checkoutTime |
+--------+----------+-----------+------------+--------------+
|  201   |   101    | [1, 2]    |    true    | /-/-/  0:0:0 |
|  202   |   102    | [3]       |    false   |              |
|  203   |   103    | [4, 5]    |    true    | /-/-/  0:0:0 |
|  204   |   103    | []        |    false   |              |
|  205   |   101    | [6]       |    true    | /-/-/  0:0:0 |
+--------+----------+-----------+------------+--------------+
*/
public class Cart {
	private Integer cartId; // 購物車 Id
	private Integer userId; // 使用者 Id
	private List<CartItem> cartItems; // 購物車明細
	private Boolean isCheckout; // 是否結帳
	private Date checkoutTime; // 結帳時間
	
	
	
}
