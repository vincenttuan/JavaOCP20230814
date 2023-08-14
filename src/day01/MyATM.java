package day01;

import java.util.Scanner;

public class MyATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sysPin = 1234;
		int sysBalance = 10000;
		
		// 密碼驗證服務迴圈
		while (true) {
			// 1.請輸入密碼
			System.out.print("請輸入密碼:");
			int userPin = sc.nextInt(); // 得到使用者所輸入的密碼
			
			// 2.密碼驗證
			if(userPin != sysPin) {
				System.out.println("密碼輸入錯誤, 請重新輸入!");
				continue; // 重跑回圈
			} else {
				System.out.println("密碼驗證成功!");
				break; // 跳離迴圈
			}
		}
		
		// 系統主畫面服務迴圈
		while (true) {
			System.out.print("主選單操作:\n1.查詢餘額\n2.存款\n3.提款\n4.退出\n==> ");
            
		}
		
	}

}
