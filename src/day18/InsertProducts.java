package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// 單筆
public class InsertProducts {
	public static void main(String[] args) throws Exception {
		String sql = "Insert into products(name, price) values(?, ?)";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345678");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 單筆
		pstmt.setString(1, "甘蔗汁");
		pstmt.setInt(2, 55);
		int rowcount = pstmt.executeUpdate();
		System.out.println("異動筆數: " + rowcount);
		pstmt.close();
		conn.close();
	}
}
