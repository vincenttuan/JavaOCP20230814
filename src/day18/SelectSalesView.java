package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SelectSalesView {

	public static void main(String[] args) throws Exception {
		// sql 指令
		String sql = "SELECT "
				+ "	no, date, product_id, branch_id, city_id, "
				+ "    product_name, price as product_price, qty as product_qty, "
				+ "    branch_name, name as city_name "
				+ " FROM demo.sales_view ORDER BY no";
		
		// 透過 Class.forName(""); 建立 MySQL 物件
		// JDBC 3.0 需要寫, JDBC 4.0 則可不用
		// JDBC 3.0 與 4.0 的差別在於 jar 檔案中是否有 META-INF/services/java.sql.Driver 的結構
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		// 透過 DriverManager 來取得 Connection 物件
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345678");
		// 下達 sql 語句給 mysql
		Statement stmt = conn.createStatement();
		// 取得結果
		ResultSet rs = stmt.executeQuery(sql);
		// 將結果依序印出
		List<Map<String, Object>> sales = new ArrayList<>();
		while (rs.next()) {
			String no = rs.getString("no");
			String date = rs.getString("date");
			Integer productId = rs.getInt("product_id");
			Integer branchId = rs.getInt("branch_id");
			Integer cityId = rs.getInt("city_id");
			String productName = rs.getString("product_name");
			Integer productPrice = rs.getInt("product_price");
			Integer productQty = rs.getInt("product_qty");
			String branchName = rs.getString("branch_name");
			String cityName = rs.getString("city_name");
			
			// 將資料放到 Map 中
			Map<String, Object> map = new LinkedHashMap<>();
			map.put("no", no);
			map.put("date", date);
			map.put("productId", productId);
			map.put("branchId", branchId);
			map.put("cityId", cityId);
			map.put("productName", productName);
			map.put("productPrice", productPrice);
			map.put("productQty", productQty);
			map.put("branchName", branchName);
			map.put("cityName", cityName);
			
			// 注入到 sales 集合中
			sales.add(map);
			
			System.out.printf("%4s", no);
			System.out.printf("%12s", date);
			System.out.printf("%4s", productId);
			System.out.printf("%4s", branchId);
			System.out.printf("%4s", cityId);
			System.out.printf("%12s", productName);
			System.out.printf("%4s", productPrice);
			System.out.printf("%4s", productQty);
			System.out.printf("%8s", branchName);
			System.out.printf("%4s", cityName);
			System.out.printf("%4s", no);
			System.out.printf("%4s", no);
			System.out.printf("%n");
		}
		
		conn.close();
		
		System.out.println(sales);
		System.out.println(sales.size());
	}

}
