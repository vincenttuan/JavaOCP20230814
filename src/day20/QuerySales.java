package day20;

import java.sql.Connection;
import java.sql.DriverManager;

public class QuerySales {
  public static void main(String[] args) {
    // 透過 jdbc 連線 mysql 資料庫, 資料表: sales
    String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei";
    String username = "root";
    String password = "12345678";
    String sqlstr = "select no, date, product_id, branch_id from sales";
    // 建立連線 + 查詢
    try (var conn = DriverManager.getConnection(url, username, password);
        var stmt = conn.createStatement();
        var rs = stmt.executeQuery(sqlstr);) {
      
      while (rs.next()) {
          String no = rs.getString("no");
          String date = rs.getString("date");
          String product_id = rs.getString("product_id");
          String branch_id = rs.getString("branch_id");
          System.out.printf("%s %s %s %s \n", no, date, product_id, branch_id);
      }

    } catch (Exception e) {
      e.printStackTrace();
    } // 因為使用了 AutoCloseable, 所以不用再寫 finally
    // 會自動關閉 conn, stmt, rs

  }
}