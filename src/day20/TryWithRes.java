package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class TryWithRes {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println(10/0);
		}
		
		// 同等於
		
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println(10/0);
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		
		try(Connection conn = DriverManager.getConnection("dburl")) {
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		// 同等於
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("dburl");
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}
			}
		}
		
		
	}

}
