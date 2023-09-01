package day06;

public class CarDemo2 {

	public static void main(String[] args) {
		// 在建立 Car 物件的同時就將 color 與 speed 設定好
		Car car1 = new Car("黑", 80);
		// 印出資訊
		System.out.printf("%s, %d\n", car1.color, car1.speed);
		// 加速 3 次
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		// 印出資訊
		System.out.printf("%s, %d\n", car1.color, car1.speed);
		// 減速 2 次
		car1.brake();
		car1.brake();
		// 印出資訊
		System.out.printf("%s, %d\n", car1.color, car1.speed);
		
	}

}
