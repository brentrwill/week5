package week5.encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {

		/**
		 * Here we create an Object or an instance of CreditCard for a Card Holder named
		 * Karen.
		 */
		CreditCard cc = new CreditCard();
		cc.setCardNumber("4444-5555-6666-7777-8888");
		cc.setExperationDate("12/24");
		cc.setCvvCode("123");
		cc.setNameOnCard("Karen Johnson");

		/**
		 * If I try to access the Credit Card Number directly, eclipse will complain. If
		 * you uncomment the below line eclipse with give an error
		 */
		// cc.cardNumber

		/**
		 * Testing with an empty password to see if an Exception is thrown from the CreditCard class
		 * if we send in an invalid password.
		 */
		System.out.println("1 -----------------------------------");
		try {
			String password = "";
			String cardNumber = cc.getCardNumber(password);
			/**
			 * Prints out the last 4 digits
			 */
			System.out.println(cardNumber.substring(cardNumber.length() - 4, cardNumber.length()));
		} catch (Exception ex) {
			/**
			 * This should print out an error message from the Exception because my password is invalid.
			 * The getMessage() is the message from my CreditCard class.
			 */
			System.out.println("Error : " + ex.getMessage());
		}
		/**
		 * This just prints an extra space.
		 */
		System.out.println("\n");
		
		/**
		 * Now let's test with a good password and see if we can access or our data.
		 */
		System.out.println("2 -----------------------------------");
		try {
			String password = "mypassword";
			String cardNumber = cc.getCardNumber(password);
			/**
			 * Prints out the last 4 digits
			 */
			System.out.println(cardNumber.substring(cardNumber.length() - 4, cardNumber.length()));
		} catch (Exception ex) {
			/**
			 * This should not print any error message
			 */
			System.out.println(ex.getMessage());
		}
		/**
		 * This just prints an extra space.
		 */
		System.out.println("\n");
		
		/**
		 * Now let's access the nameOnCard and we can do that because this Class is in the same package and can access protected values.
		 * NOTE: This is not the best practice but it is just showing the encapsulation properties.
		 */
		System.out.println("3 -----------------------------------");
		String nameOnCard = cc.nameOnCard;
		System.out.println(nameOnCard);
		
	}

}
