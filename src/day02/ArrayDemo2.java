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
		
		
	}
}
