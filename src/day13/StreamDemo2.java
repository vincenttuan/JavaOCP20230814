package day13;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.Supplier;

public class StreamDemo2 {
	public static void main(String[] args) {
		// 1.得到成績列表 95.5, 43.5, 30.8, 75.9, 100.0
		// 2.過濾出及格的分數
		// 3.將分數(及格)加權10%
		// 4.印出分數
		
		Supplier<Double[]> scoresGenerator = () -> new Double[] {
				95.5, 43.5, 30.8, 75.9, 100.0	
		};
		
		Arrays.stream(scoresGenerator.get())
			  .filter(score -> score > 60)
			  //.map(score -> score * 1.1)
			  .map(score -> {
				  // 將 score 轉 BigDecimal x
				  // 將 1.1 轉 BigDecimal y
				  BigDecimal x = new BigDecimal(score+"");
				  BigDecimal y = new BigDecimal("1.1");
				  return x.multiply(y).doubleValue(); // x * y
			  })
			  .forEach(score -> System.out.println(score));
	}
}
