package behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
	
	private String creditCardNumber;

	public CreditCardPayment(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using credit card number: " + creditCardNumber);
	}

}