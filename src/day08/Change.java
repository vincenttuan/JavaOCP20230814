package day08;

import java.util.Scanner;

// 找零錢程式
// 紙鈔: 500, 100
// 零錢: 50, 10, 5, 1
public class Change {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入商品金額:");
		int price = scanner.nextInt();
		System.out.print("請輸入付款金額:");
		int amount = scanner.nextInt();
		// 計算找零金額
		int change = amount - price;
		System.out.printf("找零金額: %d 元\n", change);
		// 計算每個銅板(50, 10, 5, 1)各要找幾個 ?
		// 假設 change = 73
		int coin50 = change / 50; // 73/50 = 1 個 50
		change = change % 50;     // 73 % 50 = 23 ... change
		
		int coin10 = change / 10; // 23 / 10 = 2 個 10
		change = change % 10;     // 23 % 10 = 3 ... change
		
		int coin5 = change / 5;   // 3 / 5 = 0 個 5
		change = change % 5;      // 3 % 5 = 3 ... change 
		
		int coin1 = change;
		
		System.out.printf("50元 %d 個\n", coin50);
		System.out.printf("10元 %d 個\n", coin10);
		System.out.printf("5元 %d 個\n", coin5);
		System.out.printf("1元 %d 個\n", coin1);
	}

}
