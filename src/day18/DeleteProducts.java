package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// 刪除單筆
public class DeleteProducts {
	public static void main(String[] args) throws Exception {
		String sql = "Delete From products Where id >= ?";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345678");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 刪除單筆
		pstmt.setInt(1, 101);
		int rowcount = pstmt.executeUpdate();
		System.out.println("異動筆數: " + rowcount);
		pstmt.close();
		conn.close();
	}
}
