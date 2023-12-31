package day13;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;

/**
 API:
 @FunctionalInterface 
 public interface Function<T,R> { 
 	R apply(T t); 
 }
 接受一個參數<T>並回傳一個結果<R>
 */
public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 你到匯率兌換店兌換金錢, 給店員 955 台幣, 店員(Function)會給你等值的美金
		Function<Integer, Double> exchange = twd -> twd / 32.13;
		// 兌換 955
		Double usd = exchange.apply(955);
		//System.out.printf("%.1f\n", usd); // 透過下面寫的 Consumer 來取代此行程式
		// 寫一個可以印出美金到小數點 1 位的 Consumer
		Consumer<Double> printUSD = money -> System.out.printf("%.1f\n", money);
		printUSD.accept(usd);
		
		// 你給廚師一個食材, 廚師(Function)會根據食材做一到料理給你
		Function<String, String> cook = ingredient -> "焦糖風烤" + ingredient;
		String food = cook.apply("玉米");
		System.out.println(food);
		
		// BMI
		BiFunction<Double, Double, Double> calcBmi = (h, w) -> w / Math.pow(h/100, 2);
		System.out.println(calcBmi.apply(170.0, 60.0));
		
		// Binary -> Bi 參數是二個
		// Operator -> 操作這個函數
		BinaryOperator<Double> calcBmi2 = (h, w) -> w / Math.pow(h/100, 2);
		System.out.println(calcBmi2.apply(170.0, 60.0));
		
		// 參數與回傳值一定是 double 時使用
		DoubleBinaryOperator calcBmi3 = (h, w) -> w / Math.pow(h/100, 2);
		System.out.println(calcBmi3.applyAsDouble(170.0, 60.0));
	}

}
