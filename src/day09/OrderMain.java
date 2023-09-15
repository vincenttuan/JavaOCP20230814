package day09;

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
				burger3, fries1, drink2
		};
		
		// 請計算總價(要考慮服務費)
		
	}

}
