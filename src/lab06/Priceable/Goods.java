package lab06.Priceable;

public class Goods implements Priceable{
    private int price;

    public Goods(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
