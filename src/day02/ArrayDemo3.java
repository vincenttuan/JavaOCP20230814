package day02;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 學員成績資料(合法成績: 0~100)
		int[] scores = {78, 53, -30, 210, 95, 83, 47};
		
		// 請求出合法成績中最高分與最低分各為多少 ?
		int max = 0; // 假定 0 就是最高分
		int min = 100; // 假定 100 就是最低分
		
		for(int x : scores) {
			if(x >=0 && x <= 100) {
				if(x > max) { // 判斷 x 是否 > max
					max = x;  // x 變為目前的最高分
				}
				if(x < min) { // 判斷 x 是否 < min
					min = x;  // x 變為目前的最低 分
				}
			}
		}
		
		System.out.printf("最高分: %d\n", max);
		System.out.printf("最低分: %d\n", min);
	}

}
