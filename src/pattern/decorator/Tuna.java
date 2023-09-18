package pattern.decorator;

public class Tuna extends Sidedish {
	public Tuna(Food food) {
		super(food);
		name = "鮪魚";
		price = 25;
	}
}
