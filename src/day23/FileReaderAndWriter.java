package day23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 多執行緒檔案讀取與寫入
// Runnable 負責寫入檔案
// Callable 負責讀取檔案
public class FileReaderAndWriter {
	// 實現 Runnable 負責寫入檔案
	static class FileWriterTask implements Runnable {
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
				// 將 "Hello Java" 寫入到 data.txt 中
				String content = "Hello Java";
				Path path = Paths.get("src/day23/data.txt");
				Files.write(path, content.getBytes());
				System.out.println("資料寫入到檔案");
			} catch (Exception e) {
				
			}
		}
	}
	
	// 實現 Callable 負責讀取檔案
	static class FileReaderTask implements Callable<String> {

		@Override
		public String call() throws Exception {
			// 資料從檔案中讀取
			return "檔案的資料...";
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		ExecutorService service= Executors.newFixedThreadPool(2);
		
		// 寫入文件工作
		Runnable writeTask = new FileWriterTask();
		// 讀取文件工作
		Callable<String> readerTask = new FileReaderTask();
		
		// 執行任務工作
		//service.execute(writeTask);
		
		//Future fut = service.submit(writeTask);
		//System.out.println(fut.get()); // 得到 null
		
		Future fut = service.submit(writeTask, "寫入完畢");
		System.out.println(fut.get()); // 得到 寫入完畢
		
		Future<String> future = service.submit(readerTask);
		System.out.println(future.get());
		
		//Thread.sleep(3000);
		//service.shutdownNow(); // 強迫關閉
		
		service.shutdown(); // 平滑關閉
		
	}

}
