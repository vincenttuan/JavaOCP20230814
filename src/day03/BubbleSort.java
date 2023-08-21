package day03;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {9, 2, 7, 3, 4, 8, 1};
		System.out.println(Arrays.toString(array));
		
		int len = array.length;
		
		for(int k=0;k<len-1;k++) {
			for(int i=0;i<len-(k+1);i++) {
				if(array[i] > array[i+1]) {
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
		
	}

}
