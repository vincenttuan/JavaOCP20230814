package day04;

import java.util.Arrays;

public class MultiArrayDemo1 {

	public static void main(String[] args) {
		// 利用二維陣列模擬電影院座位表
		int[][] seat = {
						 {1, 0, 0, 0, 1},
						 {0, 1, 0, 1, 0},
						 {0, 0, 1, 0, 0},
					   };
		
		System.out.printf("第1排第1個位置 seat[0][0] = %d\n", seat[0][0]);
		System.out.printf("第2排第4個位置 seat[1][3] = %d\n", seat[1][3]);
		System.out.printf("第3排第3個位置 seat[2][2] = %d\n", seat[2][2]);
		
		// 顯示二維陣列內容
		for(int[] array : seat) {
			for(int value : array) {
				System.out.print(value);
			}
			System.out.println();
		}
		
		for(int[] array : seat) {
			System.out.println(Arrays.toString(array));
		}
		
	}

}
