package week5.interfac;

/**
 * Simple Calculator Stuff, add, subtract, divide and multiply 2 numbers. The interface determines the methods of any Class 
 * that implements this interface. It allows us to create many class that have the same method but might be different in how
 * it is implements.
 * 
 * Here is an example of that. If I wanted to connect to Database to get information. It would be really nice if I use the same method
 * to connect to Oracle, Microsoft SQL, Mongo or MySQL.
 * 
 * So the Java Language team created an Interface that looks something like this:
 * 
 * Database.connect(url, username, password);
 * 
 * Underneath the Vendor i.e., Oracle might use a Socket, HTTP, or TCP, UPD to connect to the database but all you know is I can connect with
 * a url and a username and password.
 *
 */
public interface ThingsICanDoWithACalcualtor {
	
	/**
	 * Add 2 numbers and return the results. 
	 */
	public int add2Numbers(int firstNumber, int secondNumber);
	
	/**
	 * Divide 2 numbers and return the results. 
	 */
	public int divide2Numbers(int firstNumber, int secondNumber);
	
	/**
	 * Subtract 2 numbers and return the results. 
	 */
	public int substract2Numbers(int firstNumber, int secondNumber);
	
	/**
	 * Multiply 2 numbers and return the results. 
	 */
	public int multiply2Numbers(int firstNumber, int secondNumber);
	
}
