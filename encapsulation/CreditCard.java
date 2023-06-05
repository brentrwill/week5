package week5.encapsulation;

/**
 * Simple Credit Card Class that represent concepts of encapsulation. 
 * As you can see from the properties, we have 4 properties. The properties below a important but the 
 * CC number and CVV code are the most important and must be the most secure.
 * 
 * These are set a protected but should really be private but you can use protected for properties you want 
 * to share between classes in the same package. This means that all class in the encapsulation package can
 * access the below properties
 * 
 * - nameOnCard 
 * - experationDate
 * 
 * For the below properties you want to make sure the no one access these without a password. The example
 * with the password is no secure but just showing some ways to make it more secure. The real thing is 
 * making sure that the cardNumber and cvvCode are private and protected.
 * 
 * - cardNumber
 * - cvvCode
 * 
 * You also notice that for the getCardNumber and getCvvCode I have a special declaration called "throws Exception".
 * What this means we are intentionally going to return an Exception if the password is empty or null. This is a way
 * to help a user or the system make changes if there is an Exception
 * 
 */
public class CreditCard {
	protected String nameOnCard;
	protected String experationDate;
	private String cardNumber;
	private String cvvCode;

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getExperationDate() {
		return experationDate;
	}

	public void setExperationDate(String experationDate) {
		this.experationDate = experationDate;
	}

	public String getCardNumber(String password) throws Exception {
		if(password != null && password.length() > 0) {
			return cardNumber;
		} else {
			throw new Exception("Invalid password, please provide a valid password.");
		}
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvvCode(String password) throws Exception {
		if(password != null && password.length() > 0) {
			return cvvCode;
		} else {
			throw new Exception("Invalid password, please provide a valid password.");
		}
	}

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
}
