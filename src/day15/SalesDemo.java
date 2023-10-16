package day15;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SalesDemo {

	public static void main(String[] args) throws Exception {
		// 取得 sales_data.txt
		List<String> lines = Files.readAllLines(Paths.get("src/day15/sales_data.txt"));
		System.out.printf("資料筆數: %s\n", lines.size());
	}

}
