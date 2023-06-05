package week5.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		/**
		 * These are Objects that inherit from Employee, so you construct them with the same
		 * values as the Employee Constructor.
		 */
		Engineer engineer = new Engineer("Jane", "Smith", 1234, "888-111-2323", "08/22");
		System.out.println("Enginer's Name: " + engineer.getFirstName() + " - " + engineer.getLastName());
		
		Teacher teacher = new Teacher("Mary", "Johnson", 4321, "888-222-4444", "09/21");
		System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " - Contact Number : " + teacher.getContactPhoneNumber());
		
		/**
		 * I can create lot's of Objects that implement Employee and I can add properties to them to help keep all the Employee data
		 * centralized.
		 */
	}
}
