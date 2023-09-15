package day09;

import java.util.Arrays;

public class OrderMain {

	public static void main(String[] args) {
		// 建立商品 
		Burger burger1 = new Burger("大麥克", 70);
		Burger burger2 = new Burger("麥香魚", 50);
		Burger burger3 = new Burger("龍蝦堡", 350);
		Fries fries1 = new Fries("大薯", 65);
		Fries fries2 = new Fries("中薯", 40);
		Drink drink1 = new Drink("可樂", 25);
		Drink drink2 = new Drink("檸檬紅茶", 30);
		
		// 訂購單(購物車)
		Product[] cart = {
				burger1, fries1, drink1,
				burger3, fries2, drink2
		};
		
		// 請計算總價(要考慮服務費)
		int sum = 0;
		for(Product product : cart) {
			sum += product.getPrice();
		}
		System.out.printf("總價: %d\n", sum);
		System.out.printf("總價(含服務費): %.0f\n", sum * (1 + Product.SERVICE_FEE_RATE));
		
		double sum2 = Arrays.stream(cart).mapToDouble(Product::getPrice).sum();
		System.out.printf("總價: %.0f\n", sum2);
		System.out.printf("總價(含服務費): %.0f\n", sum2 * (1 + Product.SERVICE_FEE_RATE));
		
		
	}

}
