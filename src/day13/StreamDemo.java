package day13;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamDemo {
	public static void main(String[] args) {
		// 1.得到數列 1, 2, 3, 4, 5, 6, 7, 8, 9 -> Supplier
		Supplier<Integer[]> numsGenerator = () -> new Integer[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9
		};
		
		// 2.1 過濾出偶數 -> Predicate
		Predicate<Integer> even = num -> num % 2 == 0;
		// 2.2 過濾出奇數 -> Predicate
		Predicate<Integer> odd = num -> num % 2 == 1;
		
		// 3.1 將數值平方 -> Function
		Function<Integer, Integer> pow = num -> num * num;
		// 3.2 將數值*2 -> Function
		Function<Integer, Integer> twice = num -> num * 2;
		
		// 4.1 印出數值(有換行) -> Consumer
		Consumer<Integer> printlnNum = num -> System.out.println(num);
		// 4.2 印出數值(無換行) -> Consumer
		Consumer<Integer> printNum = num -> System.out.print(num);
		
		// 自訂事務機
		Arrays.stream(numsGenerator.get())
			  .filter(odd) // even, odd
			  .map(twice) // pow, twice
			  .forEach(printNum); // printlnNum, printNum
		
		System.out.println("\n-----------------");
		// 事務機
		Arrays.stream(numsGenerator.get()) // Supplier: 1, 2, 3, 4, 5, 6, 7, 8, 9
			  .filter(num -> num % 2 == 0) // Predicate: 2, 4, 6, 8
			  .map(num -> num * num) // Function: 4, 16, 36, 64
			  .forEach(num -> System.out.println(num)); // Consumer
		
		
		
		
	}
}
