package day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

import static java.lang.System.out; // 靜態 import (jdk 1.4 開始提供)
public class ArrayStream5 {

	public static void main(String[] args) {
		// 陣列與串流 stream
		// 陣列轉串流可以透過 Arrays.stream()
		String[] scores = {"100", "一百", "70", "40", null, "abc", "我出運了", "90", "-50"};
		// 請計算出"及格"的有幾人?總分?平均?最高?最低?
		// Java 8 以後
		IntSummaryStatistics stat = null; 
		stat = Arrays.stream(scores)
					 .filter(score -> score != null)
					 .filter(score -> score.matches("\\d+")) // "100", "70", "40", "90", "-50"
					 .mapToInt(score -> Integer.parseInt(score)) // 100, 70, 40, 90, -50
					 .filter(score -> score >= 60) // 100, 70, 90
					 .summaryStatistics();
		
		System.out.printf("及格的有 %d 人 總分 %d 平均 %.1f 最高 %d 最低 %d\n",
				 stat.getCount(), stat.getSum(), stat.getAverage(), stat.getMax(), stat.getMin());

	}

}
