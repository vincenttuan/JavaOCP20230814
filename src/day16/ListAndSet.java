package day16;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
		List<Set<String>> salesList = new ArrayList<>();
		for(int k=1;k<lines.size();k++) { // 從 1 開始, 因為 0 是標頭資料
			// 將 line 利用 , 切開
			String[] array = lines.get(k).split(",");
			Set<String> sales = new LinkedHashSet<>();
			for(int i=0;i<array.length;i++) {
				sales.add(array[i]); // 將每一個元素放到 sales 集合
			}
			salesList.add(sales); // 將 sales 集合元素放到 salesList 中
		};
		System.out.println(salesList);
		
		// 利用 Java Stream Api 改寫成更加簡潔且易於閱讀的程式碼
		List<Set<String>> salesList2 = lines.stream() // 轉換 stream
				.skip(1) // 跳過標頭資料
				.map(line -> Arrays.stream(line.split(",")) // 將每一行以 "," 切分, 並轉 stream 以利後續處理
								   .collect(Collectors.toCollection(LinkedHashSet::new))) // 收集結果並放在 LinkedHashSet 集合中 
				.collect(Collectors.toList());
		System.out.println(salesList2);
		
	}
	
}










