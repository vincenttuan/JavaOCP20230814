package day22;

public class Person {
	
	public void job() {
		// 執行緒名稱
		String tName = Thread.currentThread().getName();
		System.out.printf("%s: 撰寫程式%n", tName);
	}
	
}
