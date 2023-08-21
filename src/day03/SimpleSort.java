package day03;

import java.util.Arrays;

public class SimpleSort {

	public static void main(String[] args) {
		int[] array = {9, 2, 7, 3, 4, 8, 1};
		System.out.println(Arrays.toString(array));
		
		// 使用 Java Stream 來排序
		array = Arrays.stream(array).sorted().toArray();
		System.out.println(Arrays.toString(array));
		
		// 使用 Java Stream 的特異功能
		// 總和, 平均, 最大, 最小
		int sum = Arrays.stream(array).sum();
		System.out.printf("總和: %d\n", sum);
		
		double avg = Arrays.stream(array).average().getAsDouble();
		System.out.printf("平均: %.1f\n", avg);
		
		int max = Arrays.stream(array).max().getAsInt();
		//int max = Arrays.stream(array).parallel().max().getAsInt(); // parallel() 平行運算
		System.out.printf("最大: %d\n", max);
		
		int min = Arrays.stream(array).min().getAsInt();
		System.out.printf("最小: %d\n", min);
		
		
		
		
	}

}
