package lab06.Priceable;

public class Apartment implements Priceable{
    private int price;

    public Apartment(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
