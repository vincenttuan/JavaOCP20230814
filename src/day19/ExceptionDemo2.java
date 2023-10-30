package day19;

import java.util.InputMismatchException;
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
		
		try {
			System.out.print("請輸入水果數量: ");
			x = sc.nextInt();
			System.out.print("請輸入人數: ");
			y = sc.nextInt();
			avg = x / y;
			System.out.printf("平均每人得: %d%n", avg);
		} catch (InputMismatchException e) {
			System.out.println("參數輸入錯誤 !");
		} catch (ArithmeticException e) {
			System.out.println("分母不可 = 0");
		} finally {
			// 放到 finally 表示此行一定會被執行
			// 不論是否上面程式有其他未知的錯誤發生
			sc.close(); 
		}
	}
}
