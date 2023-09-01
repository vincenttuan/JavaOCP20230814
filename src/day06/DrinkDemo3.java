package day06;

import java.util.Arrays;

public class DrinkDemo3 {

	public static void main(String[] args) {
		Drink drink1 = new Drink("咖啡", 75, 500);
		Drink drink2 = new Drink("冰茶", 2, 700);
		Drink drink3 = new Drink("豆漿", 35, 600);
		Drink drink4 = new Drink("牛奶", 65, 200);
		Drink drink5 = new Drink("果汁", 4, 300);
		
		Drink[] drinks = {drink1, drink2, drink3, drink4, drink5};
		// 請計算出冷熱飲各有多少容量
		// 飲料溫度 (小於5度表示冷飲, 大於60度表示熱飲)
		// 計算冷飲的總容量
		int coldDrinkVolume = 0;
		for(Drink drink : drinks) {
			if(drink.temperature < 5) {
				coldDrinkVolume += drink.volume;
			}
		}
		System.out.printf("冷飲的總容量: %,d cc\n", coldDrinkVolume);
		
		// 利用 Stream API 求解
		int coldDrinkVolume2 = Arrays.stream(drinks)
									 .filter(drink -> drink.temperature < 5) // Drink("冰茶", 2, 700), Drink("果汁", 4, 300)
									 .mapToInt(drink -> drink.volume)        // 700, 300
									 .sum(); // 1000
		System.out.printf("冷飲的總容量: %,d cc\n", coldDrinkVolume2);
									 
		

	}

}
