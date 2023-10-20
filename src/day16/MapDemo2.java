package day16;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// 2330, 50
		// 2330, 40
		List<List<Integer>> list = new ArrayList<>();
		list.add(List.of(2330, 10));
		list.add(List.of(2330, 20));
		list.add(List.of(0050, 30));
		list.add(List.of(2317, 40));
		list.add(List.of(0050, 50));
		list.add(List.of(2330, 60));
		System.out.println(list);
		
		Map<Integer, Integer> portfolio = new LinkedHashMap<>();
		
		list.forEach(stock -> {
			portfolio.computeIfPresent(stock.get(0), (key, value) -> value + stock.get(1));
			portfolio.computeIfAbsent(stock.get(0), key -> stock.get(1));
		});
		
		
		System.out.println(portfolio);
		
		
		
	}
	

}
