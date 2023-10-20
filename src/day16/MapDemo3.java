package day16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		// 利用 groupingBy 組合
		List<String> fruits = List.of("apple", "orange", "apple", "banana", "papaya", "apple", "banana");
		System.out.println(fruits);
		// 請計算每種水果的個數
		// apple=3, banana=2, orange=1, papaya=1
		Map<String, Long> result = fruits.stream().collect(
					Collectors.groupingBy(name->name, Collectors.counting())
				);
		System.out.println(result);
	}

}
