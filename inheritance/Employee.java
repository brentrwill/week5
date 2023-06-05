package week5.inheritance;

/**
 * This is my parent Employee and all my Child Employees will inherit from
 * Employee. We make it abstract because no one will create an Employee directly.
 * 
 * The best way to describe inheritance is thinking of it as a parent/child relationship.
 * Employee is the Parent and Teacher/Engineer inherit the traits/properties of Employee.
 * 
 */
public abstract class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private String contactPhoneNumber;
	private String startDate;
	
	/**
	 *  This is the constructor that creates an Employee. The gets and sets are all below.
	 */
	public Employee(String firstName, String lastName, int employeeId, String contactPhoneNumber, String startDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.contactPhoneNumber = contactPhoneNumber;
		this.startDate = startDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
