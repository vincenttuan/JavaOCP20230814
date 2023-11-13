package day23;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;

// 可以得到 lotto 號碼的 callable(有回傳值)
public class Lotto implements Callable<Integer[]> {

	@Override
	public Integer[] call() throws Exception {
		// 取得 1~39 不重複的數字 5 個, 取得後放到 Integer[] 陣列中, 並回傳
		
		Integer[] nums = IntStream.generate(() -> new Random().nextInt(39) + 1)
								  .distinct()	
								  .limit(5)
								  .boxed()
								  .toArray(Integer[]::new);
		
		return nums;
	}

}
