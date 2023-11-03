package day20;

public class CallStackDemo4 {

	public static void main(String[] args) {
		System.out.println("begin");
		int x = 10;
		int y = 0;
		
		try {
			div(x, y);
		} catch (InvalidYArgException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}
	
	public static void div(int x, int y) throws InvalidYArgException {
		// 檢查參數
		if (y == 0) {
			InvalidYArgException re = new InvalidYArgException("分母不可 = 0");
			throw re;
		}
		// 執行
		System.out.println(x / y);
	}

}
