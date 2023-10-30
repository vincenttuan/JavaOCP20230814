package day19;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		bmr();
	}
	
	// 基礎代謝率(Basal Metabolic Rate, BMR)
	// 公式： 男：66＋( 13.7*體重kg＋5*身高cm－6.8*年齡) 
	//       女：655＋( 9.6*體重kg＋1.8*身高cm－4.7*年齡)
	public static void bmr() {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入性別(男:1, 女:2): ");
		int sex = sc.nextInt();
		System.out.print("請輸入身高(cm): ");
		double h = sc.nextDouble();
		System.out.print("請輸入體重(kg): ");
		double w = sc.nextDouble();
		System.out.print("請輸入年齡(整數): ");
		int age = sc.nextInt();
		
		// 印出 bmr ?
		
	}

}