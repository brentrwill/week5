package week5.inheritance;

/**
 * Here is an example of an Engineer class that extends Employee. 
 */
public class Engineer extends Employee {
	
	/**
	 * This constructs an Engineer class but inherits the properties of Employee.
	 */
	public Engineer(String firstName, String lastName, int employeeId, String contactPhoneNumber, String startDate) {
		super(firstName, lastName, employeeId, contactPhoneNumber, startDate);
	}

}
