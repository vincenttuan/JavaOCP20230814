package day08;

import java.util.Arrays;

public class Change2 {

	public static void main(String[] args) {
		Money[] moneyArray = {
				new Note(500, "500元"),
				new Note(100, "100元"),
				new Coin(50, "50元"),
				new Coin(10, "10元"),
				new Coin(5, "5元"),
				new Coin(1, "1元"),
		}; 
		
		Arrays.stream(moneyArray)
			  //.forEach(money -> money.display());
			  .forEach(Money::display);
		
		// 多型
		Money x = new Money(1000);
		x.display();
		Money y = new Note(1000, "1000元");
		y.display();
		Money z = new Coin(10, "10元");
		z.display();
		
		// 假設 moneyArray 是存錢筒, 試問存錢筒中有多少錢
		
		
		
	}

}
