package day03;

import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		int[] array = {9, 2, 7, 3, 4, 8, 1};
		System.out.println(Arrays.toString(array));
		
		// 印出奇數的資料
		// 傳統 for-loop 的寫法
		for(int i=0;i<array.length;i++) {
			if(array[i] % 2 == 1) {
				System.out.println(array[i]);
			}
		}
		// 傳統 for-each 的寫法
		for(int n : array) {
			if(n % 2 == 1) {
				System.out.println(n);
			}
		}
		// Java Stream 的寫法
		Arrays.stream(array) // 將陣列串流化 [9, 2, 7, 3, 4, 8, 1]
			  .filter(n -> n % 2 == 1) // 過濾出奇數 [9, 7, 3, 1]
			  .forEach(n -> System.out.println(n)); // 印出每一個元素
		
	}

}
