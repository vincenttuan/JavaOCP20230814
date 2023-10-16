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
		
	}

}
