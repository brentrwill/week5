package week5.polymorphism;

/**
 * A Circle Object that overrides the Shape.area method to print out the Area formula. 
 */
public class Circle extends Shape {
	@Override
	public void area() {
		System.out.println("Circle is 3.14 * radius * radius ");
	}
}
