package day16;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.stream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/*
 * [ <-- List
 * 	 [A001,2023/1/1,紅茶,30,50,台北,信義分店], <-- Set
 * 	 [A002,2023/1/1,咖啡,45,80,台北,大安分店], <-- Set
 *   [A003,2023/1/1,冰沙,60,40,高雄,左營分店], <-- Set
 *   ...
 * ]
 * */
public class ListAndSet {
	
	public static void main(String[] args) throws Exception {
		// 讀取檔案資料
		List<String> lines = Files.readAllLines(Paths.get("src/day16/sales_data.txt"));
		
		// Java 7 (含) 以前的寫法
		Set<List<String>> salesList = new LinkedHashSet<>();
		for(int k=1;k<lines.size();k++) { // 從 1 開始, 因為 0 是標頭資料
			// 將 line 利用 , 切開
			String[] array = lines.get(k).split(",");
			List<String> sales = new ArrayList<>();
			for(int i=0;i<array.length;i++) {
				sales.add(array[i]); // 將每一個元素放到 sales 集合
			}
			salesList.add(sales); // 將 sales 集合元素放到 salesList 中
		};
		System.out.println(salesList);
		
		// 利用 Java Stream Api 改寫成更加簡潔且易於閱讀的程式碼
		Set<List<String>> salesList2 = lines.stream() // 轉換 stream
				.skip(1) // 跳過標頭資料
				.map(line -> stream(line.split(",")) // 將每一行以 "," 切分, 並轉 stream 以利後續處理
							 .collect(toCollection(ArrayList::new))) // 收集結果並放在 LinkedHashSet 集合中 
				.collect(toSet());
		System.out.println(salesList2);
		
		// 分析總銷售金額 
		int totalSales = salesList2.stream()
				.mapToInt(sales -> {
					String priceStr = sales.stream().skip(3).findFirst().get();
					String qtyStr = sales.stream().skip(4).findFirst().get();
					return Integer.parseInt(priceStr) * Integer.parseInt(qtyStr);
				})
				.sum();
		System.out.println("總銷售金額: " + totalSales); 
		
	}
	
}










