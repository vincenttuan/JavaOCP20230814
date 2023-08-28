package day05;

import java.util.Arrays;
import static java.lang.System.out; // 靜態 import (jdk 1.4 開始提供)
public class ArrayStream3 {

	public static void main(String[] args) {
		// 陣列與串流 stream
		// 陣列轉串流可以透過 Arrays.stream()
		int[] scores = {100, 50, 40, 70, 90};
		// 印出及格分數的總分
		// Java 8 以前
		int sum = 0;
		for(int score : scores) {
			if(score >= 60) {
				sum += score;
			}
		}
		System.out.printf("總分: %d\n", sum);
		
		// Java 8 以後
		int sum2 = Arrays.stream(scores)
						 .filter(score -> score >= 60)
						 .sum();
		System.out.printf("總分: %d\n", sum2);
		
	}

}
