package day22;

import java.util.List;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("寫程式");
		Runnable r2 = () -> System.out.println("美工");
		Runnable r3 = () -> System.out.println("表演");
		
		List.of(r1, r2, r3, ()->System.out.println("報告"))
			.forEach(r -> new Thread(r).start());
		
	}

}
