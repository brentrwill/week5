package week5.interfac;

/**
 * Calculator interface example. 
 */
public class InterfaceExample {
	public static void main(String[] args) {
		
		/**
		 * MyCalculator, MyAdvancedCalculator both implement the ThingsICanDoWithACalcualtor interface. However,
		 * MyAdvancedCalculator add an additional method call roundANumber so you can use MyAdvancedCalculator for 
		 * all the same operations as MyCalculator but has an added method.
		 */
		
		MyCalculator myCalculator = new MyCalculator();
		
		System.out.println("\n1 -----------------------------------");
		int results = myCalculator.add2Numbers(10, 20);
		System.out.println("Results should be 30 : " + results);
		
		System.out.println("\n2 -----------------------------------");
		results = myCalculator.multiply2Numbers(10, 20);
		System.out.println("Results should be 200 : " + results);
		
		System.out.println("\n3 -----------------------------------");
		results = myCalculator.divide2Numbers(200, 20);
		System.out.println("Results should be 10 : " + results);
		
		System.out.println("\n4 -----------------------------------");
		results = myCalculator.substract2Numbers(200, 100);
		System.out.println("Results should be 100 : " + results);
		
		
		/**
		 * MyAdvancedCalculator has the same behavior as MyCalculator with an added method.
		 */
		MyAdvancedCalculator myAdvancedCalculator = new MyAdvancedCalculator();
		System.out.println("\n5 -----------------------------------");
		results = myAdvancedCalculator.add2Numbers(10, 20);
		System.out.println("Results should be 30 : " + results);
		
		System.out.println("\n6 -----------------------------------");
		results = myAdvancedCalculator.multiply2Numbers(10, 20);
		System.out.println("Results should be 200 : " + results);
		
		System.out.println("\n7 -----------------------------------");
		results = myAdvancedCalculator.divide2Numbers(200, 20);
		System.out.println("Results should be 10 : " + results);
		
		System.out.println("\n8 -----------------------------------");
		results = myAdvancedCalculator.substract2Numbers(200, 100);
		System.out.println("Results should be 100 : " + results);
		
		System.out.println("\n9 -----------------------------------");
		results = myAdvancedCalculator.roundANumber(10.20);
		System.out.println("Results should be 10 : " + results);
		
	}
}
