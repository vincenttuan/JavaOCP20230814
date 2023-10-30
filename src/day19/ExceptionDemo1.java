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
		
		if ((sex = input("性別", "請輸入性別(男:1, 女:2): ", Integer.class, sc)) == null) {
			return;
		}
		
		if((h = input("身高", "請輸入身高(cm): ", Double.class, sc)) == null) {
			return;
		}
		
		if((w = input("體重", "請輸入體重(kg): ", Double.class, sc)) == null) {
			return;
		}
		
		if((age = input("年齡", "請輸入年齡(整數): ", Integer.class, sc)) == null) {
			return;
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
	
	/**
	 * 通用輸入方法，根據給定的類型從Scanner讀取數值。
	 * 
	 * @param <T>     數值的泛型類型
	 * @param name    用於錯誤提示的參數名稱
	 * @param message 提示用戶輸入的消息
	 * @param clazz   需要返回的數字類型的Class對象
	 * @param sc      Scanner對象用於讀取輸入
	 * @return 返回輸入的數字，或null如果有輸入不匹配的錯誤
	 */
	private static <T extends Number> T input(String name, String message, Class clazz, Scanner sc) {
	    // 顯示提示消息給用戶
	    System.out.print(message);
	    
	    try {
	        // 如果需要的是整數類型
	        if(clazz == Integer.class) {
	            // 讀取整數，然後將其轉型為T類型並返回
	            return (T) clazz.cast(sc.nextInt());
	        } 
	        // 如果需要的是雙精度浮點數類型
	        else if (clazz == Double.class) {
	            // 讀取雙精度浮點數，然後將其轉型為T類型並返回
	            return (T) clazz.cast(sc.nextDouble());
	        }
	        // 注意：當前只支持Integer和Double，若需要其他類型則需要進一步擴展
	    } 
	    // 捕獲輸入不匹配異常，例如用戶輸入了文本而不是數字
	    catch (InputMismatchException e) {
	        // 告訴用戶哪個參數出錯了
	        System.out.println(name + "輸入錯誤");
	        // 清空Scanner的buffer，這樣可以再次嘗試讀取
	        sc.nextLine();
	    }
	    // 如果有任何異常，或者未知的類型，返回null
	    return null;
	}

}
