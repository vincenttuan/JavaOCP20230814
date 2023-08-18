package day02;

public class ArrayDemo2 {
	public static void main(String[] args) {
		// 學員成績資料(合法成績: 0~100)
		int[] scores = {78, 53, -30, 210, 95, 83, 47};
		// 請印出合法成績
		for(int x : scores) {
			if(x >= 0 && x <= 100) { // 合法成績: 0~100
				System.out.print(x + ", ");
			}
		}
		System.out.println();
		
		// 請幫我算出合法成績的總分與平均 = ?
		int sum = 0; // 計算總分用
		int count = 0; // 合法成績的數量
		for(int x : scores) {
			if(x >= 0 && x <= 100) { // 合法成績: 0~100
				sum += x; // sum = sum + x
				count++; // 合法成績的數量 + 1
			}
		}
		double avg = (count == 0) ? 0 : (double)sum / count; // 平均
		
		System.out.printf("合法成績總分: %d\n", sum);
		System.out.printf("合法成績平均: %.1f\n", avg);
		
	}
}
