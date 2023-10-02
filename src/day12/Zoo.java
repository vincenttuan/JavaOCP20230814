package day12;

// 外部類別
public class Zoo {
	private String zooName = "圓山";
	
	// 一般內部類別
	class Animal {
		String name;
		public Animal(String name) {
			this.name = name;
		}
		void eat() {
			// 一般內部類別可以取得外部類別的私有(private)成員 
			System.out.printf("%s 動物園的 %s 正在吃東西\n", zooName, name);
		}
	}
	
}
