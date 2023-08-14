package day01;

import java.util.Scanner;

// 根據 MyATM 進行優化
public class MyATM2 {
	
	static Scanner sc = new Scanner(System.in);
	static int sysPin = 1234;
	static int sysBalance = 10000;
	
	public static void main(String[] args) {
		checkPin();
	}
	
	// 1. 驗證密碼
	public static void checkPin() {  
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
		// 呼叫 showMenu
		showMenu();
	} 
	
	// 2. 主畫面選單
	public static void showMenu() {  
		// 系統主畫面服務迴圈
		while (true) {
			System.out.print("主選單操作:\n1.查詢餘額\n2.存款\n3.提款\n4.退出\n==> ");
            int itemId = sc.nextInt(); // 得到使用者所輸入的選單選項
            switch (itemId) {
				case 1: // 餘額查詢
					checkBalance();
					break;
				case 2: // 存款
					deposit();
					break;
				case 3: // 提款
					withdraw();
					break;
				case 4: // 離開
					quit();
					break;
			}
		}
	}
	
	// 2.1 餘額查詢
	public static void checkBalance() {  
		
	}
	
	// 2.2 存款
	public static void deposit() {  
		
	}
	
	// 2.3 提款
	public static void withdraw() {  
		
	}
	
	// 2.4 離開
	public static void quit() {  
		
	}	
	
	
}
