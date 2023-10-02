package day12;

interface Greet {
	void hello();
	//void welcome();
}

interface Calc {
	int max(int x, int y);
}

public class AnonymousAndLambda {

	public static void main(String[] args) {
		// 匿名內部類別
		Greet greet1 = new Greet() {
			@Override
			public void hello() {
				System.out.println("Hello World!");
			}
		};
		greet1.hello();
		
		// Lambda
		Greet greet2 = () -> System.out.println("Hello World!");
		greet2.hello();
		
		// Lambda 標準寫法
		Calc calc1 = (int x, int y) -> {
			if(x > y) {
				return x;
			} else {
				return y;
			}
		};
		
		// Lambda 簡化寫法 1
		Calc calc2 = (var x, var y) -> {
			if(x > y) {
				return x;
			} else {
				return y;
			}
		};
		
		// Lambda 簡化寫法 2
		Calc calc3 = (x, y) -> {
			if(x > y) {
				return x;
			} else {
				return y;
			}
		};
		
		// Lambda 簡化寫法 3
		Calc calc4 = (x, y) -> {return x > y ? x : y;};
		// 若實作只有一行可以省略 return
		Calc calc5 = (x, y) -> x > y ? x : y;
		Calc calc6 = (x, y) -> Math.max(x, y);
		
		// Lambda 簡化寫法 4
		// 若實作只有一行可以省略 return
		// 必要時可以利用 :: 方法參考
		// Calc calc6 = (x, y) -> Math.max(x, y); 改成下面
		Calc calc7 = Math::max;
	}

}






