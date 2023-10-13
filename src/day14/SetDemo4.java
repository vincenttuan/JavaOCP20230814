package day14;

import java.security.SecureRandom;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {
	public static void main(String[] args) {
		// 利用 Stream API
		Set<Integer> numbers = new TreeSet<>();
		
		new SecureRandom().ints(1, 10) // 產生一個隨機數字流, 範圍是 1..9
						  .distinct()
						  .limit(5)
						  //.forEach(num -> numbers.add(num)); // 添加到集合
						  .forEach(numbers::add); // 添加到集合
		
		System.out.println(numbers);
	}
}
