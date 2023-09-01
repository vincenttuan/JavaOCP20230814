package day06;

public class CarDemo3 {

	public static void main(String[] args) {
		// 在建立 Car 物件的同時就將 color 與 speed 設定好
		Car car1 = new Car("白", 60);
		Car car2 = new Car("黑", 80);
		Car car3 = new Car("紅", 70);
		
		// 黑車加速
		car2.accelerate();
		
		// 印出資訊
		System.out.printf("%s, %d\n", car1.color, car1.speed);
		System.out.printf("%s, %d\n", car2.color, car2.speed);
		System.out.printf("%s, %d\n", car3.color, car3.speed);
		
	}

}
