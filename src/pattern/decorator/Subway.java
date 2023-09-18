package pattern.decorator;

public class Subway {
	public static void main(String[] args) {
		Food food = new Bread();
		food = new Ham(food);
		food = new Egg(food);
		food = new Egg(food);
		food = new Egg(food);
		food = new Olive(food);
		food = new Tomato(food);
		food = new Tomato(food);
		food = new Tomato(food);
		food = new Tomato(food);
		food = new Tuna(food);
		food = new Tuna(food);
		food = new Lettuce(food);
		food = new Lettuce(food);
		
		System.out.println(food.getName());
		System.out.println(food.getPrice());
	}
}
