package day12;

public class ZooMain {

	public static void main(String[] args) {
		Zoo zoo1 = new Zoo();
		zoo1.introduceAnimal("大象");
		
		Zoo.Animal animal = new Zoo().new Animal("老虎");
		//Zoo.Animal animal = zoo1.new Animal("老虎");
		animal.eat();

	}

}
