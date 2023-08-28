package day05;

import java.util.Arrays;
import static java.lang.System.out; // 靜態 import (jdk 1.4 開始提供)
public class ArrayStream2 {

	public static void main(String[] args) {
		// 陣列與串流 stream
		// 陣列轉串流可以透過 Arrays.stream()
		int[] scores = {100, 50, 40, 70, 90};
		// 印出及格分數
		// Java 8 以前
		for(int score : scores) {
			if(score >= 60) {
				System.out.println(score);
			}
		}
		
		// Java 8 以後
		Arrays.stream(scores).filter(score -> score >= 60).forEach(out::println);
		
		Arrays.stream(scores)
			  .filter(score -> score >= 60)
			  .forEach(out::println);
		
	}

}
