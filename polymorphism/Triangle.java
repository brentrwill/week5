package week5.polymorphism;

/**
 * A Triangle Object that overrides the Shape.area method to print out the Area formula. 
 */
public class Triangle extends Shape {
	@Override
	public void area() {
		System.out.println("Triangle is ½ * base * height ");
	}
}
