package day12;

// 手電筒
public class Flashlight {
	// 靜態內部類別
	// 他可以獨立於手電筒而存在, 但是仍然屬於手電筒
	static class Battery {
		int capacity = 100;
		void charge1() { // 要建立 Battery 實例才可以調用 
			System.out.println(capacity + "電池正在充電中");
		}
		
		static void charge2() { // 不須要建立 Battery 實例就可以調用
			System.out.println("電池正在充電中");
		}
	}
	
	public static void main(String[] args) {
		Flashlight.Battery battery = new Flashlight.Battery();
		battery.charge1();
		
		Flashlight.Battery.charge2();
		
	}
	
}
