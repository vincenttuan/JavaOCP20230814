package day05;

import java.util.Arrays;
import static java.lang.System.out;

public class ArrayStream6 {

	public static void main(String[] args) {
		// mapToXXX 進行練習
		String[] names = {"John", "Bob", "Vincent", "Anita", "Jo"};
		// 印出每一個名字有幾個字
		Arrays.stream(names)  // "John", "Bob", "Vincent", "Anita", "Jo"
			  .mapToInt(name -> name.length()) // 4, 3, 7, 5, 2
			  .forEach(out::println);
		// 平均姓名有幾個字
		double avg = Arrays.stream(names)  // "John", "Bob", "Vincent", "Anita", "Jo"
			  			   .mapToInt(name -> name.length()) // 4, 3, 7, 5, 2
			  			   .average() // 計算平均
			  			   .orElse(0); // 若沒有平均則回傳 0
		System.out.println(avg);
	}

}
