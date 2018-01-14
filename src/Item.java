import java.util.Objects;

//equals and hashcode
public class Item {
    private String id;
    private double price;

    public Item(String id, double price) {
        this.id = id;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
                Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }
}
