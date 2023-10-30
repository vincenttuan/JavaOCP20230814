package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		bmr();
	}
	
	// 基礎代謝率(Basal Metabolic Rate, BMR)
	// 公式： 男：66＋( 13.7*體重kg＋5*身高cm－6.8*年齡) 
	//       女：655＋( 9.6*體重kg＋1.8*身高cm－4.7*年齡)
	// 粗估正常範圍: 男 1400~1800, 女 1200~1500
	
	public static void bmr() {
		Scanner sc = new Scanner(System.in);
		Integer sex = null;
		Double h = null;
		Double w = null;
		Integer age = null;
		// try-catch 錯誤處理
		try {
			System.out.print("請輸入性別(男:1, 女:2): ");
			sex = sc.nextInt();
			System.out.print("請輸入身高(cm): ");
			h = sc.nextDouble();
			System.out.print("請輸入體重(kg): ");
			w = sc.nextDouble();
			System.out.print("請輸入年齡(整數): ");
			age = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("參數輸入不正確");
			return; // 方法停止 
		}
		
		sc.close(); // 關閉 scanner
		
		// 印出 bmr ?
		double bmr = 0;
		switch (sex) {
			case 1:
				bmr = 66 + (13.7 * w + 5 * h - 6.8 * age); 
				break;
			case 2:
				bmr = 655 + (9.6 * w + 1.8 * h - 4.7 * age);
				break;
			default:
				System.out.println("性別錯誤");
		}
		System.out.printf("BMR: %.1f\n", bmr);
		
	}

}
