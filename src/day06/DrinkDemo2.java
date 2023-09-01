package day06;

import java.util.Arrays;

public class DrinkDemo2 {

	public static void main(String[] args) {
		Drink drink1 = new Drink("咖啡", 75, 500);
		Drink drink2 = new Drink("冰茶", 2, 700);
		Drink drink3 = new Drink("豆漿", 35, 600);
		Drink drink4 = new Drink("牛奶", 50, 200);
		Drink drink5 = new Drink("果汁", 10, 300);
		
		Drink[] drinks = {drink1, drink2, drink3, drink4, drink5};
		// 請透過 drinks 完成以下需求
		// 1.加熱咖啡
		Arrays.stream(drinks)
			  .filter(drink -> drink.name.equals("咖啡"))  // 過濾出咖啡
			  .forEach(drink -> drink.heatUp()); // 加熱咖啡
		
		// 2.冰果汁
		Arrays.stream(drinks)
			  .filter(drink -> drink.name.equals("果汁")) // 過濾出果汁
			  .forEach(drink -> drink.coolDown()); // 冰果汁
		
		
		// 3.喝牛奶分別喝 5cc 與 20cc
		Arrays.stream(drinks)
			  .filter(drink -> drink.name.equals("牛奶")) // 過濾出牛奶
			  .forEach(drink -> {
				  drink.sip(5);    // 喝 5cc
				  drink.sip(200);  // 喝 20cc
			  }); // 喝牛奶
		
		// 4.印出飲料資料
		Arrays.stream(drinks).forEach(drink -> drink.print());
		

	}

}
