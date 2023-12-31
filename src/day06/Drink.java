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
		if(volume > 0) {
			this.volume -= volume;
			if(this.volume < 0) {
				this.volume = 0;
			}
		}
	}
	
	public void print() { // 印出 drink 物件內的資料
		System.out.printf("飲料名稱: %s 溫度: %d °C 容量: %d cc\n", name, temperature, volume);
	}
	
}
