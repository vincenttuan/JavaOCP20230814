package day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

import static java.lang.System.out; // 靜態 import (jdk 1.4 開始提供)
public class ArrayStream4 {

	public static void main(String[] args) {
		// 陣列與串流 stream
		// 陣列轉串流可以透過 Arrays.stream()
		int[] scores = {100, 50, 40, 70, 90};
		// 請計算出"及格"的有幾人?總分?平均?最高?最低?
		// Java 8 以前
		// 請回家自行撰寫
		
		// Java 8 以後
		IntSummaryStatistics stat = Arrays.stream(scores)
										  .filter(score -> score >= 60)
										  .summaryStatistics();
		System.out.println(stat);
		System.out.printf("及格的有 %d 人 總分 %d 平均 %.1f 最高 %d 最低 %d\n",
						 stat.getCount(), stat.getSum(), stat.getAverage(), stat.getMax(), stat.getMin());
	}

}
