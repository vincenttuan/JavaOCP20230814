package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// 計算機
		calc();
	}
 
	public static void calc() {
		Integer x = null; // 水果數量
		Integer y = null; // 人數
		Integer avg = null; // 平均每人得幾顆
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("請輸入水果數量: ");
			x = sc.nextInt();
			System.out.print("請輸入人數: ");
			y = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("參數輸入錯誤 !");
			return;
		} finally {
			// 放到 finally 表示此行一定會被執行
			// 不論是否上面程式有其他未知的錯誤發生
			sc.close(); 
		}
		
		if(y > 0) {
			avg = x / y;
			System.out.printf("平均每人得: %d%n", avg);
		} else {
			System.out.println("人數不正確 ");
		}
	}
}
