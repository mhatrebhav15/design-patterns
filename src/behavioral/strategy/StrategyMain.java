package behavioral.strategy;

public class StrategyMain {
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// Selecting payment methods dynamically
		cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
		cart.checkout(100);

		cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
		cart.checkout(50);

		cart.setPaymentStrategy(new BitcoinPayment("1AbCdEfGhIjK1LmNoPqRsTuVwXyZ"));
		cart.checkout(200);
	}

}