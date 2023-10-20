package day16;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// K(Key), V(Value)
		Map<String, Integer> portfolio = new LinkedHashMap<>();
		portfolio.put("2330", 30);
		portfolio.put("2303", 30);
		portfolio.put("2317", 50);
		portfolio.put("0050", null);
		System.out.println(portfolio);
		System.out.println(portfolio.get("2330"));
		System.out.println(portfolio.get("1101"));
		System.out.println(portfolio.keySet());
		System.out.println(portfolio.values());
		
		portfolio.containsKey("2330");
		portfolio.containsValue(50);
		
		// 若 0050 的 value == null 則改為 1
		portfolio.compute("0050", (key, value) -> value == null ? 1 : value);
		System.out.println(portfolio);
		
		// 若 key 不存在就加入新元素 {1101=1}, 若存在則不動作
		portfolio.computeIfAbsent("1101", key -> 1);
		portfolio.computeIfAbsent("2330", key -> 1);
		System.out.println(portfolio);
		
	}
	

}
