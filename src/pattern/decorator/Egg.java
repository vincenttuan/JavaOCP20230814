package pattern.decorator;

public class Egg extends Sidedish {
	public Egg(Food food) {
		super(food);
		name = "雞蛋";
		price = 18;
	}
}
