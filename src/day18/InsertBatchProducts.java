package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

// 多筆(批次)
public class InsertBatchProducts {
	public static void main(String[] args) throws Exception {
		Object[][] datas = {
				{"芒果汁", 60}, {"鳳梨汁", 70}, {"椰子汁", 80}
		};
		String sql = "Insert into products(name, price) values(?, ?)";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345678");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 多筆(批次)
		pstmt.clearBatch(); // 清除 batch
		
		for(Object[] data : datas) {
			pstmt.setString(1, data[0]+"");
			pstmt.setInt(2, Integer.parseInt(data[1]+""));
			pstmt.addBatch();
		}
		
		int[] rowcounts = pstmt.executeBatch();
		System.out.println("異動筆數: " + Arrays.toString(rowcounts));
		
		int rowcount = pstmt.executeUpdate();
		System.out.println("異動筆數: " + rowcount);
		pstmt.close();
		conn.close();
	}
}
