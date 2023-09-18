package day10;

interface Bar {
	String NAME = "Bar"; // public static final
	void foo(); // public abstract
	
	//------------------------------------------------------------
	
	default void copyright() { // jdk 8
		System.out.println("copyright " + version());
	}
	
	static void print2() { // jdk 8 (不可以被複寫的類別方法)
		System.out.println("print...");
	}
	
	private int version() { // jdk 9, 主要是給 default 方法用的
		return 1;
	}
	
	private static void print() { // jdk 9, 主要是給 default 與 private 方法用的
		System.out.println("print...");
	}
}

interface SmartDevice { // 智能設備
	String BRAND = "SmartHome Inc"; // 品牌名稱
	
	// 啟動/關閉的抽象方法
	void turnOn();
	void turnOff();
	
	// 透過一個 default 方法來顯示設備名稱 
	default void displayBrand() {
		System.out.println("智能設備品牌名稱: " + BRAND);
	}
	
	// 利用 static 方法來顯示一般錯誤
	static void displayError() {
		System.out.println("不支援此服務");
	}
	
	// 設計一個 private 方法來計算使用設備的時間 
	private int uptimeHours(int startHour, int endHour) {
		return endHour - startHour;
	} 
	
	// 透過一個 default 方法來顯示設備運行時間
	default void displayUptime(int startHour, int endHour) {
		System.out.println("設備運行時間: " + uptimeHours(startHour, endHour));
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
