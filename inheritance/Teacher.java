package week5.inheritance;

public class Teacher extends Employee {
	/**
	 * This constructs an Teacher class but inherits the properties of Employee.
	 */
	public Teacher(String firstName, String lastName, int employeeId, String contactPhoneNumber, String startDate) {
		super(firstName, lastName, employeeId, contactPhoneNumber, startDate);
	}
}
