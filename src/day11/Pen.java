package day11;

import java.util.Objects;

public class Pen {
	private String color;
	private int price;
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(!(obj instanceof Pen)) {
			return false;
		}
		Pen pen = (Pen)obj;
		return Objects.equals(color, pen.color) && price == pen.price;
	}



	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}
	
}
