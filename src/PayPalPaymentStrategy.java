public class PayPalPaymentStrategy implements PaymentStrategy {
    private String email;
    private String pass;

    public PayPalPaymentStrategy(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pay with pay pal: +" + amount);
    }
}
