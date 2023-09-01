package day06;

import java.util.Arrays;

public class CarDemo5 {

	public static void main(String[] args) {
		// 在建立 Car 物件的同時就將 color 與 speed 設定好
		Car car1 = new Car("白", 60);
		Car car2 = new Car("黑", 80);
		Car car3 = new Car("紅", 70);
		
		// 建立 Car[] 將 car1~car3 放入
		Car[] cars = {car1, car2, car3};
		System.out.println(cars);
		// 請將黑車加速一次, 紅車減速二次
		// 最後印出每一台車的顏色與車速
		// 請用 Java 8 Stream 實現
		Arrays.stream(cars)
			  .peek(car -> {  // 觀察每一個元素
				  switch (car.color) {
					case "黑":
						car.accelerate(); // 加速一次
						break;
					case "紅":
						// 減速二次
						car.brake(); 
						car.brake();
						break;
				  }
			  })
			  .forEach(car -> System.out.printf("%s, %d\n", car.color, car.speed));
		
		// 印出平均速度 
		double avg = Arrays.stream(cars)    // car1, car2, car3 的資料
						   .mapToInt(car -> car.speed)  // 60, 85, 60 三台車的速度 speed 資料
						   .average()
						   .orElse(0); // 若沒有得到平均就以 0 來表示
		System.out.printf("平均速度: %.1f km\n", avg);
	}

}
