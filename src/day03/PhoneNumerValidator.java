package day03;

import java.util.regex.Pattern;

public class PhoneNumerValidator {

	public static void main(String[] args) {
		// 手機號碼 09xx-xxxxxx (x 指的是 0~9 的數字)
		String phoneNumber1 = "0912-345678";
		String phoneNumber2 = "0812-345678";
		String phoneNumber3 = "0912-345O78";
		
		/* 定義正則表達式
		 *	^ 起頭
		 *	09 匹配 "09"
		 *	\\d{2} 匹配二位數字
		 *	- 匹配 "-"
		 *	\\d{6} 匹配六位數字
		 *	$ 結尾
		*/
		String regex = "^09\\d{2}-\\d{6}$";
		System.out.println(Pattern.matches(regex, phoneNumber1));
		System.out.println(Pattern.matches(regex, phoneNumber2));
		System.out.println(Pattern.matches(regex, phoneNumber3));
		
		// 信用卡號 xxxx-xxxx-xxxx-xxxx (x 指的是 0~9 的數字)
		String card1 = "1234-5678-9012-3456";
		String card2 = "1234 5678 9012 3456";
		//String regex2 = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$";
		String regex2 = "^(\\d{4}-){3}\\d{4}$";
		System.out.println(Pattern.matches(regex2, card1));
		System.out.println(Pattern.matches(regex2, card2));
		
		// 信用卡號 xxxx-xxxx-xxxx-xxxx (x 指的是 0~9 的數字)
		// 信用卡號 xxxx xxxx xxxx xxxx (x 指的是 0~9 的數字)
		// [-\\s] []:字符集 \s:空格
		String regex3 = "^(\\d{4}[-\\s]){3}\\d{4}$";
		System.out.println(Pattern.matches(regex3, card1));
		System.out.println(Pattern.matches(regex3, card2));
	}

}
