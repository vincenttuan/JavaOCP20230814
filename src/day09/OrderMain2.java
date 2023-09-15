package day09;

import java.util.Arrays;

public class OrderMain2 {

	public static void main(String[] args) {
		// 建立商品 
		Burger burger1 = new Burger("大麥克", 70);
		Burger burger2 = new Burger("麥香魚", 50);
		Burger burger3 = new Burger("龍蝦堡", 350);
		Fries fries1 = new Fries("大薯", 65);
		Fries fries2 = new Fries("中薯", 40);
		Drink drink1 = new Drink("可樂", 25);
		Drink drink2 = new Drink("檸檬紅茶", 30);
		
		// 組合餐
		final Product[] A = {burger1, fries1, drink1};
		final Product[] B = {burger2, fries2, drink1};
		final Product[] C = {burger3, fries1, drink2};
		
		// 訂餐(購物車)
		Product[][] cart = {A, B, C};
		
		// 請問總價
		double sum = 0;
		for(Product[] items : cart) {
			for(Product item : items) {
				sum += item.getPrice();
			}
		}
		System.out.println(sum);
		System.out.println(sum * (1 + Product.SERVICE_FEE_RATE));
		
		// 請問總價 Java 8 Stream
		double sum2 = Arrays.stream(cart) // 二維陣列串流
							//.flatMap(items -> Arrays.stream(items)) // 扁平化: 二維陣列串流 -> 一維陣列串流 
							.flatMap(Arrays::stream) // 扁平化: 二維陣列串流 -> 一維陣列串流 
							//.mapToDouble(product -> product.getPrice())
							.mapToDouble(Product::getPrice)
							.sum();
		System.out.println(sum2);
		System.out.println(sum2 * (1 + Product.SERVICE_FEE_RATE));
	}

}
