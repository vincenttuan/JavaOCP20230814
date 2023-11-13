package day23;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LottoDemo {

	public static void main(String[] args) {
		Callable<Integer[]> lotto = new Lotto();
		FutureTask<Integer[]> task = new FutureTask<>(lotto);
		
		// 建立一條執行緒去執行
		new Thread(task).start();
		
		// 得到回傳結果
		try {
			Integer[] nums = task.get();
			System.out.println(Arrays.toString(nums));
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}

}
