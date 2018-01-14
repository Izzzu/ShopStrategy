
public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String name;
    private String creditCard;
    private String cvv;

    public CreditCardPaymentStrategy(String name, String creditCard,
                                     String cvv) {
        this.name = name;
        this.creditCard = creditCard;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pay with credit card: " + amount);
        System.out.println();
    }
}
