package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// 修改單筆
public class UpdateProducts {
	public static void main(String[] args) throws Exception {
		String sql = "Update products set price = ? Where id = ?";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345678");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 修改單筆
		pstmt.setInt(1, 43);
		pstmt.setInt(2, 101);
		int rowcount = pstmt.executeUpdate();
		System.out.println("異動筆數: " + rowcount);
		pstmt.close();
		conn.close();
	}
}
