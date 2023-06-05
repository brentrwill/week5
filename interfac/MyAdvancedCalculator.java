package week5.interfac;

/**
 * MyAdvancedCalculator implements the ThingsICanDoWithACalcualtor but it also adds a method called roundANumber, so even if my class
 * implements an interface, it can hold other methods.
 */
public class MyAdvancedCalculator implements ThingsICanDoWithACalcualtor{

	@Override
	public int add2Numbers(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public int divide2Numbers(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	@Override
	public int substract2Numbers(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public int multiply2Numbers(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	/**
	 * As you can see here, my advanced calculator has a round method 
	 */
	public int roundANumber(double number) {
		return (int)Math.round(number);
	}
}
