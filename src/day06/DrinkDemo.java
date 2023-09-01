package day06;

public class DrinkDemo {

	public static void main(String[] args) {
		Drink drink1 = new Drink("咖啡", 75, 500);
		Drink drink2 = new Drink("冰茶", 2, 700);
		Drink drink3 = new Drink("豆漿", 35, 600);
		Drink drink4 = new Drink("牛奶", 50, 200);
		Drink drink5 = new Drink("果汁", 10, 300);
		
		// 加熱咖啡
		drink1.heatUp();
		// 冰果汁
		drink5.coolDown();
		// 喝牛奶分別喝 5cc 與 20cc
		drink4.sip(5);
		drink4.sip(20);
		// 印出飲料資料
		drink1.print();
		drink2.print();
		drink3.print();
		drink4.print();
		drink5.print();
		
		//Drink[] drinks = {drink1, drink2, drink3, drink4, drink5};
		
		

	}

}
