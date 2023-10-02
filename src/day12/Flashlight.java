package day12;

// 手電筒
public class Flashlight {
	// 靜態內部類別
	// 他可以獨立於手電筒而存在, 但是仍然屬於手電筒
	static class Battery {
		static void charge() { // static 可以加可不加
			System.out.println("電池正在充電中");
		}
	}
	
	public static void main(String[] args) {
		Flashlight.Battery battery = new Flashlight.Battery();
		battery.charge();
	}
	
}
