package day12;

public class ZooMain {

	public static void main(String[] args) {
		Zoo zoo1 = new Zoo();
		zoo1.introduceAnimal("大象");
		
		Zoo.Animal animal = new Zoo().new Animal("老虎");
		animal.eat();
		
		Zoo.Animal animal2 = zoo1.new Animal("猴子");
		Zoo.Animal animal3 = zoo1.new Animal("企鵝");
		Zoo.Animal animal4 = zoo1.getAnimal("長頸鹿");
		animal2.eat();
		animal3.eat();
		animal4.eat();

	}

}
