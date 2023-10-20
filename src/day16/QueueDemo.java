package day16;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 佇列(對列): FIFO
 * 特殊的 List 就要使用 Queue 而非使用 ArrayList
 * */
public class QueueDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Queue<String> printQueue = new LinkedList<>();
		
		// 假設有三項列印任務
		printQueue.offer("文件1.pdf"); // 或用 add() 都可以
		printQueue.offer("文件2.doc");
		printQueue.offer("圖片1.png");
		System.out.println("列印任務: " + printQueue);
		// 處理佇列的列印任務, 直到佇列為空
		while (!printQueue.isEmpty()) {
			// 提取列印任務
			String printJob = printQueue.poll();
			System.out.println("正在列印: " + printJob);
			Thread.sleep(2000); // 模擬列印時間 200ms(2秒)
		}
		System.out.println("列印任務: " + printQueue);
		System.out.println("所有列印任務完成");
	}
	
}
