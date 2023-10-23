package day17;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;

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
	}

}
