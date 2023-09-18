package pattern.decorator;

public class Ham extends Sidedish {
	public Ham(Food food) {
		super(food);
		name = "火腿";
		price = 30;
	}
}
