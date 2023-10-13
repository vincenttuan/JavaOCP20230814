package day14;

import java.security.SecureRandom;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {
	public static void main(String[] args) {
		// 1. 利用 Stream API 取 1..9 五個不重複的數字
		Set<Integer> numbers = new TreeSet<>();
		
		new SecureRandom().ints(1, 10) // 產生一個隨機數字流, 範圍是 1..9
						  .distinct()
						  .limit(5)
						  //.forEach(num -> numbers.add(num)); // 添加到集合
						  .forEach(numbers::add); // 添加到集合
		
		System.out.println(numbers);
		
		// 2. 利用 Stream API 取 1..9 三個不重複的偶數 (利用: filter)
		Set<Integer> numbers2 = new TreeSet<>();
		
		new SecureRandom().ints(1, 10) // 產生一個隨機數字流, 範圍是 1..9
						  .filter(num -> num % 2 == 0) // 過濾出偶數
						  .distinct()
						  .limit(3)
						  .forEach(numbers2::add); // 添加到集合

		System.out.println(numbers2);
		
		// 3. 利用 Stream API 隨機取 0..100(含) 10個不重複的分數
		// 分析邏輯: 0~60:不及格, 60~85:及格, 86~100:優良
		// 提示:    不及格, 及格, 優良 的人數放在一個 int[] 中
		// 印出範例: [50, 90, 95, 79, 65, 62, 81, 40, 30, 78]
		//        不及格:3人, 及格:5人, 優良:2人
		Set<Integer> scores = new TreeSet<>();
		// 請完成
		int[] counts = {0, 0, 0}; // 不及格, 及格, 優良
		new SecureRandom().ints(0, 101)
						  .distinct()
						  .limit(10)
						  .forEach(scores::add);
		
		scores.forEach(score -> {
			if(score < 60) counts[0]++; // 將 不及格 人數 +1
			else if (score > 85) counts[2]++; // 將 優良 人數 +1
			else counts[1]++; // 將 及格 人數 +1
		});
		
		System.out.println(scores);
		System.out.printf("不及格:%d人, 及格:%d人, 優良:%d人\n", 
				counts[0], counts[1], counts[2]);
		
	}
}
