package day06;

public class Drink {
	String name; // 飲料名稱
	int temperature; // 飲料溫度 (小於5度表示冷飲, 大於60度表示熱飲)
	int volume; // 飲料容量(cc)
	
	public Drink(String name, int temperature, int volume) {
		this.name = name;
		this.temperature = temperature;
		this.volume = volume;
	}
	
	public void coolDown() { // 降低溫度 
		temperature -= 5;
	}
	
	public void heatUp() { // 提高溫度
		temperature += 5;
	}
	
	public void sip(int volume) { // 啜飲
		this.volume -= volume;
	}
	
	
}
