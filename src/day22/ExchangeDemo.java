package day22;

interface Callback {
	void result(int ex);
}

public class ExchangeDemo {
	public static void main(String[] args) {
		int x = 100;
		
		Callback callback = (ex) -> {
			// x = x * 匯率(ex)
			System.out.println("x = " + (x * ex));
		};
		
		Thread t1 = new Exchange(callback);
		t1.start();
				
	}
}
