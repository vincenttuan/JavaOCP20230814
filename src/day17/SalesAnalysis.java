package day17;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toMap;

// 分析 sales_data.json
// 1. 建立 SaleRecord 物件
// 2. 將 sales_data.json 的資料匯入到集合中 List<SalesRecord>
public class SalesAnalysis {
	
	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		FileReader reader = new FileReader("src/day17/sales_data.json");
		// TypeToken 可以幫助 Gson 知道要轉換的類型
		List<SaleRecord> saleRecords = gson.fromJson(reader, new TypeToken<List<SaleRecord>>() {}.getType());
		System.out.println(saleRecords.size());
		System.out.println(saleRecords);
		
		// 1.1 按產品(product)來分組, 計算每一個產品的總銷售數量(qty)
		Map<String, Integer> productQtyMap = saleRecords.stream()
										.collect(groupingBy(SaleRecord::getProduct, summingInt(SaleRecord::getQty)));
		
		System.out.println("銷售數量按照產品分組: " + productQtyMap);
		
		// 1.2 請問哪一種商品銷售數量最多
		Map.Entry<String, Integer> maxEntry = Collections.max(productQtyMap.entrySet(), Map.Entry.comparingByValue());
		System.out.println("哪一種商品銷售數量最多: " + maxEntry.getKey() + ", 數量: " + maxEntry.getValue());
		
		// 1.3 請問哪一種商品銷售數量最少
		Map.Entry<String, Integer> minEntry = Collections.min(productQtyMap.entrySet(), Map.Entry.comparingByValue());
		System.out.println("哪一種商品銷售數量最少: " + minEntry.getKey() + ", 數量: " + minEntry.getValue());
		
		// 1.4 按照銷售數量來排序(降序排序 大->小)
		Map<String, Integer> sortedByQty = productQtyMap.entrySet().stream()
														.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
														.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedByQty);
		
		// 2.1 按城市(city)來分組, 計算每一個產品的總銷售數量(qty) 
		Map<String, Integer> cityQtyMap = saleRecords.stream()
				.collect(groupingBy(SaleRecord::getCity, summingInt(SaleRecord::getQty)));
		
		System.out.println("銷售數量按照城市分組: " + cityQtyMap);
		
		// 2.2 按照 cityQtyMap 銷售數量來排序(降序排序 大->小)
		Map<String, Integer> sortedByQty2 = cityQtyMap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(sortedByQty2);
		
		// 3. Homework 請求出每個城市(city)銷售額(price*qty)最高的產品(product)
		
	}

}
