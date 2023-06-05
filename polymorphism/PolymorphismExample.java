package week5.polymorphism;

/**
 * This is an example of polymorphism. If you notice the Object, the act very
 * much like inheritance, however look at what happens when we call the Object.
 */
public class PolymorphismExample {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape triangle = new Triangle();

		/**
		 * We call the same method for circle and triangle, but the Java Compiler is
		 * able to determine by polymorphism which method to call. Technically both
		 * Objects are shapes but the new operator declared them as the type but the
		 * Variable to the left claims to be a Shape.
		 */

		/**
		 * Both of these are shapes but because we declared the types the correct area
		 * method is call.
		 */
		circle.area();
		triangle.area();

		/**
		 * Again the thing to remember here is that Polymorphism is just like
		 * inheritance but the compiler or the Java Runtime can determine which Object
		 * is being called.
		 */
	}
}
