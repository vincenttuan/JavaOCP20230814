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

	}

}
