package day19;

import java.io.Closeable;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Happy implements Closeable {

	@Override
	public void close() {
		System.out.println("下了囉");
	}
	
}

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// 計算機
		calc();
	}
 
	public static void calc() {
		Integer x = null; // 水果數量
		Integer y = null; // 人數
		Integer avg = null; // 平均每人得幾顆
		
		
		// Java 7 try-with-resource 語法
		// 可以自動執行 close()
		try(Scanner sc = new Scanner(System.in);
			Happy happy = new Happy()) {
			System.out.print("請輸入水果數量: ");
			x = sc.nextInt();
			System.out.print("請輸入人數: ");
			y = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("參數輸入錯誤 !");
			return;
		}
		
		if(y > 0) {
			avg = x / y;
			System.out.printf("平均每人得: %d%n", avg);
		} else {
			System.out.println("人數不正確 ");
		}
	}
}
