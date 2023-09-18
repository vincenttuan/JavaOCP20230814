package pattern.decorator2;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee coffee = new BasicCoffee();
		coffee = new MilkDecorator(coffee);
		coffee = new SugarDecorator(coffee);
		coffee = new FoamDecorator(coffee);
		
		System.out.println(coffee.getDesp());
		System.out.println(coffee.getCost());

	}

}
