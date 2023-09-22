package algorithm;

import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class GetPrice {

	public static void main(String[] args) throws Exception {
		String urlpath = "https://www.twse.com.tw/rwd/zh/afterTrading/STOCK_DAY?date=20230922&stockNo=0050&response=json&_=1695385770835";
		String jsonString = new Scanner(new URL(urlpath).openStream())
								.useDelimiter("\\A")
								.next();
		System.out.println(jsonString);
		
		Gson gson = new Gson();
		StockData stockData = gson.fromJson(jsonString, StockData.class);
		System.out.println(stockData);
		
		// "日期","成交股數","成交金額","開盤價","最高價","最低價","收盤價","漲跌價差","成交筆數"
		System.out.println(stockData.getFields().get(6));
		for(List<String> list : stockData.getData()) {
			System.out.println(list.get(6)); // 6 收盤價的位置
		}
	}

}
