package day06;

public class CarDemo {

	public static void main(String[] args) {
		Car car1 = new Car();
		// 設定顏色
		car1.color = "白";
		// 設定初速
		car1.speed = 60;
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
