package week5.interfac;

/**
 * As you can see, MyCalculator Class implements the ThingsICanDoWithACalcualtor which tells me what I can and
 * cannot do with my Calculator. I can add other methods but if someone was using MyCalculator, then they would know
 * which method to call.
 */
public class MyCalculator implements ThingsICanDoWithACalcualtor{

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

}
