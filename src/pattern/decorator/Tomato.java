package pattern.decorator;

public class Tomato extends Sidedish {
	public Tomato(Food food) {
		super(food);
		name = "番茄";
		price = 15;
	}
}
