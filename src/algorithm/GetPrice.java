package algorithm;

import java.net.URL;
import java.util.Scanner;

public class GetPrice {

	public static void main(String[] args) throws Exception {
		String urlpath = "https://www.twse.com.tw/rwd/zh/afterTrading/STOCK_DAY?date=20230922&stockNo=0050&response=json&_=1695385770835";
		String jsonString = new Scanner(new URL(urlpath).openStream())
								.useDelimiter("\\A")
								.next();
		System.out.println(jsonString);
	}

}
