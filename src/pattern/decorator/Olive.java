package pattern.decorator;

public class Olive extends Sidedish {
	public Olive(Food food) {
		super(food);
		name = "橄欖";
		price = 10;
	}
}
