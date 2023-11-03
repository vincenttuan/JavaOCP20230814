package day20;

public class CallStackDemo2 {

	public static void main(String[] args) {
		System.out.println("begin");
		int x = 10;
		int y = 0;
		div(x, y);
		System.out.println("end");
	}
	
	public static void div(int x, int y) {
		// 檢查參數
		if (y == 0) {
			System.out.println("分母不可 = 0");
		} else {
			// 執行
			System.out.println(x / y);
		}
	}

}
