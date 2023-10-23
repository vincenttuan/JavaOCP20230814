package day17;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

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
		
		// 1. 按產品(product)來分組, 計算每一個產品的總銷售數量(qty)
		Map<String, Integer> productQtyMap = saleRecords.stream()
										.collect(groupingBy(SaleRecord::getProduct, summingInt(SaleRecord::getQty)));
		
		System.out.println("銷售數量按照產品分組: " + productQtyMap);
		
		// 請問哪一種商品銷售數量最多
		Map.Entry<String, Integer> maxEntry = Collections.max(productQtyMap.entrySet(), Map.Entry.comparingByValue());
		System.out.println("哪一種商品銷售數量最多: " + maxEntry.getKey() + ", 數量: " + maxEntry.getValue());
		
		// 請問哪一種商品銷售數量最少
		Map.Entry<String, Integer> minEntry = Collections.min(productQtyMap.entrySet(), Map.Entry.comparingByValue());
		System.out.println("哪一種商品銷售數量最少: " + minEntry.getKey() + ", 數量: " + minEntry.getValue());
		
	}

}
