package day23;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 多執行緒檔案讀取與寫入
// Runnable 負責寫入檔案
// Callable 負責讀取檔案
public class FileReaderAndWriter {
	// 實現 Runnable 負責寫入檔案
	static class FileWriterTask implements Runnable {
		@Override
		public void run() {
			System.out.println("資料寫入到檔案");
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
		service.execute(writeTask);
		service.submit(readerTask);
		
		service.shutdown();
	}

}
