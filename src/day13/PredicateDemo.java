package day13;

import java.util.function.Predicate;

/*
 API:
 @FunctionalInterface 
 public interface Predicate<T> { 
 	boolean test(T t); 
 }
 接受一個參數<T>並回傳布林值(boolean)
 * */
public class PredicateDemo {

	public static void main(String[] args) {
		// 你去超商買酒, 夜店 門禁(Predicate) 會檢查你的年齡, 確定是否滿 18 歲
		Predicate<Integer> isOver18 = age -> age >= 18;
		boolean canBuy = isOver18.test(20); // true
		boolean canEnter = isOver18.test(16); // false
		System.out.println(canBuy);
		System.out.println(canEnter);
		
		// 你去賣場買東西要結帳, 結帳系統(Predicate)會先檢查你的購物車中是否有商品
		Predicate<String[]> checkOut = items -> items.length > 0;
		String[] cart = {"洗髮精"}; // 購物車
		if(checkOut.test(cart)) {
			System.out.println("購物車內有商品");
		} else {
			System.out.println("購物車內無商品");
		}
		
	}

}
