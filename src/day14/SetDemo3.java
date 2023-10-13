package day14;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		// 元素預設會進行自然排序(小 -> 大)
		//Set<Integer> numbers = new TreeSet<>();
		
		// 元素自訂進行反排序(大 -> 小)
		Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
				
		// 初始集合內容
		System.out.println(numbers.size());
		System.out.println(numbers);
		
		// 1~9 取 5 個不重複的數字並放入到 numbers 中
		/*
		numbers.add(1);
		numbers.add(9);
		numbers.add(2);
		numbers.add(4);
		numbers.add(7);
		*/
		SecureRandom random = new SecureRandom();
		while (numbers.size() < 5) {
			int num = random.nextInt(9) + 1;
			numbers.add(num); // Integer
			System.out.println("num = " + num);
		}
		
		System.out.println(numbers.size());
		System.out.println(numbers);
	}

}
