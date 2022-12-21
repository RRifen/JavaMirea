package lab06.Priceable;

public class Taxes implements Priceable{
    private int price;

    public Taxes(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
