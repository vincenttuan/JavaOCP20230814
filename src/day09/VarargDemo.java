package day09;

import java.util.Arrays;

public class VarargDemo {
	
	public static void calc(int... values) {
		// 要將 values 看成 int[]
		int sum = Arrays.stream(values).sum();
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		calc();
		calc(1, 2);
		calc(1, 2, 3);
		calc(1, 2, 3, 4, 5, 6, 7, 8, 9);
		calc(new int[] {10, 20, 30});
		

	}

}
