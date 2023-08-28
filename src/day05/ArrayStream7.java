package day05;

import java.util.Arrays;
import static java.lang.System.out;

public class ArrayStream7 {

	public static void main(String[] args) {
		int currentYear = 2023;
		// mapToXXX 進行練習
		String[] births = {"2000-01-01", "2008-09-02", "2005-12-03"};
		// 印出每一個年齡 ?
		Arrays.stream(births)
			  .map(birth -> birth.substring(0, 4)) // "2000", "2008", "2005"
			  .mapToInt(birth -> Integer.parseInt(birth)) // 2000, 2008, 2005
			  .map(birthYear -> currentYear-birthYear) // 23, 15, 18
			  .forEach(out::println);
		
		// 請問平均年齡幾歲 ?
		double avgAge = Arrays.stream(births)
							  .map(birth -> birth.substring(0, 4)) // "2000", "2008", "2005"
							  .mapToInt(birth -> Integer.parseInt(birth)) // 2000, 2008, 2005
							  .map(birthYear -> currentYear-birthYear) // 23, 15, 18
							  .average()
							  .orElse(0);
		System.out.printf("平均年齡: %.1f\n", avgAge);
		
		// 在一個 mapToInt() 方法中完成所有轉換
		// 印出每一個年齡 ?
		Arrays.stream(births)
			  .mapToInt(birth -> currentYear-Integer.parseInt(birth.substring(0, 4))) // 23, 15, 18
			  .forEach(out::println);
		
		// 請問平均年齡幾歲 ?
		double avgAge2 = Arrays.stream(births)
				  				.mapToInt(birth -> currentYear-Integer.parseInt(birth.substring(0, 4))) // 23, 15, 18
				  				.average().orElse(0);
		System.out.printf("平均年齡: %.1f\n", avgAge2);
	}

}
