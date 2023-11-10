package day22;

public class PersonDemo {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		person1.start();
		person2.start();
		System.out.println(Thread.activeCount());
	}

}
