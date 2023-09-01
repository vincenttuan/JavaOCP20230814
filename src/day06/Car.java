package day06;

public class Car {
	String color; // 物件屬性: 顏色
	int speed;    // 物件屬性: 速度
	
	// 建構子
	Car() {
		System.out.println("Car 建構子1");
	}
	
	Car(String c, int s) {
		System.out.println("Car 建構子2");
		color = c;
		speed = s;
	}
	
	void accelerate() { // 物件方法: 加速
		speed += 5; // speed = speed + 5;
	}
	
	void brake() { // 物件方法: 減速
		speed -= 5; // speed = speed - 5;
	}
	
}
