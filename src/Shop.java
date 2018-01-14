import java.util.LinkedList;
import java.util.List;


public class Shop {

    List<Item> items = new LinkedList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    private double calculateCost() {

        double amount = 0;
        for (Item item : items) {
            amount += item.getPrice();
        }
        return amount;
    }

    public void pay(PaymentStrategy strategy) {

        strategy.pay(calculateCost());
    }
}
