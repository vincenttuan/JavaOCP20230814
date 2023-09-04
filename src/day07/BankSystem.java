package day07;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class BankSystem {
	private static Account[] accounts = {
			new Account("A01", 10000),
			new Account("A02", 11000),
			new Account("A03", 12000)
	};
	
	public static void main(String[] args) {
		// 程式開始
		System.out.print("請輸入帳戶(A01, A02, A03):");
		Scanner scanner = new Scanner(System.in);
		String actName = scanner.next();
		
		// 根據 actName 找到指定 Account 物件
		Optional<Account> optAct = Arrays.stream(accounts)
				.filter(act -> act.getName().equals(actName))
				.findAny();
		// 判斷是否有找到 ?
		if(optAct.isPresent()) { // 有找到
			Account act = optAct.get(); // 取得 Account 物件
			act.printBalance();
		} else {
			System.out.println("無此帳戶");
		}
		
		
		
	}
}
