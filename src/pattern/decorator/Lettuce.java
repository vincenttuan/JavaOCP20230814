package pattern.decorator;

public class Lettuce extends Sidedish {
	public Lettuce(Food food) {
		super(food);
		name = "生菜";
		price = 15;
	}
}
