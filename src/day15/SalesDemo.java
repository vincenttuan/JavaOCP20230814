package day15;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

public class SalesDemo {

	public static void main(String[] args) throws Exception {
		// 取得 sales_data.txt
		List<String> lines = Files.readAllLines(Paths.get("src/day15/sales_data.txt"));
		System.out.printf("資料筆數: %s\n", lines.size());
		
		/*
		for(int i=1;i<lines.size();i++) {
			System.out.println(lines.get(i));
		}
		*/
		IntStream.range(1, lines.size())
				 .forEach(i -> System.out.println(lines.get(i)));
		
		// date,product,price,qty,city,branch
		//  0      1      2    3    4    5
		IntStream.range(1, lines.size())
		 		 .forEach(i -> {
		 			 // 印出 product
		 			 String[] array = lines.get(i).split(",");
		 			 System.out.println(array[1]); // product
		 		 });
		
		
		int sum = IntStream.range(1, lines.size()) // 元素: String
				 			.mapToObj(i -> lines.get(i).split(",")) //  元素: 轉為 String[]
				 			.mapToInt(array -> Integer.parseInt(array[2]) * Integer.parseInt(array[3])) // 元素: int
				 			.sum();
		System.out.println("整體銷售金額:" + sum);
		
		// 請算出紅茶的總銷售金額 ?
		int sum2 = IntStream.range(1, lines.size()) // 元素: String
	 			.mapToObj(i -> lines.get(i).split(",")) //  元素: 轉為 String[]
	 			.filter(array -> array[1].equals("紅茶")) // 過濾出 "紅茶"
	 			.mapToInt(array -> Integer.parseInt(array[2]) * Integer.parseInt(array[3])) // 元素: int
	 			.sum();
		System.out.println("紅茶整體銷售金額:" + sum2);
	}

}
