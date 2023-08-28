package day05;

import java.util.Arrays;
import static java.lang.System.out; // 靜態 import (jdk 1.4 開始提供)
public class ArrayStream1 {

	public static void main(String[] args) {
		// 陣列與串流 stream
		// 陣列轉串流可以透過 Arrays.stream()
		
		int[] scores = {100, 50, 40, 70, 90};
		// Java 8 以前
		for(int score : scores) {
			System.out.println(score);
		}
		// Java 8 以後
		Arrays.stream(scores).forEach(score -> System.out.println(score));
		// 方法參照 :: 目的簡化語法
		Arrays.stream(scores).forEach(System.out::println);
		// 方法參照 :: 加上 import static 目的簡化語法
		Arrays.stream(scores).forEach(out::println);
	}

}
