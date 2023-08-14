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
            int itemId = sc.nextInt(); // 得到使用者所輸入的選單選項
            switch (itemId) {
				case 1: // 查詢餘額
					System.out.printf("目前餘額 $%d\n", sysBalance);
					break;
				case 2: // 存款
					System.out.print("請輸入存款金額:");
					int depositAmount = sc.nextInt();
					if(depositAmount <= 0) {
						System.out.println("存款金額不得為0或負值");
						continue;
					} else {
						sysBalance = sysBalance + depositAmount; // 存入款項
						System.out.printf("已存款 $%d 成功, 帳戶餘額 $%d\n", depositAmount, sysBalance);
					}
					break;
				case 3: // 提款
					
					break;
				case 4: // 退出
					System.out.println("謝謝您的使用, 歡迎下次再度光臨");
					System.exit(0); // 強制離該系統(0:正常狀態, 1:異常狀態)
					break;
				default: 
					System.out.println("選項輸入錯誤請重新輸入!");
					break;
			}
            
		}
		
	}

}
