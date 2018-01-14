public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.add(new Item("chleb", 3.50));

        Item maslo = new Item("maslo", 5.25);

        shop.add(maslo);

        shop.add(new Item("pomidor", 2.15));

        CreditCardPaymentStrategy creditCardPaymentStrategy
                = new CreditCardPaymentStrategy("iza", "number", "233");
        PayPalPaymentStrategy payPalPaymentStrategy
                = new PayPalPaymentStrategy("mail", "pass");
        shop.pay(creditCardPaymentStrategy);
        shop.pay(payPalPaymentStrategy);

        shop.remove(maslo);
        shop.pay(creditCardPaymentStrategy);
    }
}
