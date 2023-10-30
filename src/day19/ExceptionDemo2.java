package day19;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// 計算機
		calc();
	}
 
	public static void calc() {
		Integer x = null; // 水果數量
		Integer y = null; // 人數
		Integer avg = null; // 平均每人得幾顆
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入水果數量: ");
		x = sc.nextInt();
		System.out.print("請輸入人數: ");
		y = sc.nextInt();
		
		avg = x / y;
		
		System.out.printf("平均每人得: %d%n", avg);
		
	}
}
