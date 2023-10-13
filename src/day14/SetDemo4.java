package day14;

import java.security.SecureRandom;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {
	public static void main(String[] args) {
		// 1. 利用 Stream API 取 1..9 五個不重複的數字
		Set<Integer> numbers = new TreeSet<>();
		
		new SecureRandom().ints(1, 10) // 產生一個隨機數字流, 範圍是 1..9
						  .distinct()
						  .limit(5)
						  //.forEach(num -> numbers.add(num)); // 添加到集合
						  .forEach(numbers::add); // 添加到集合
		
		System.out.println(numbers);
		
		// 2. 利用 Stream API 取 1..9 三個不重複的偶數 (利用: filter)
		Set<Integer> numbers2 = new TreeSet<>();
		
		new SecureRandom().ints(1, 10) // 產生一個隨機數字流, 範圍是 1..9
						  .filter(num -> num % 2 == 0) // 過濾出偶數
						  .distinct()
						  .limit(3)
						  .forEach(numbers2::add); // 添加到集合

		System.out.println(numbers2);
		
	}
}
