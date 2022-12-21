package lab06.Priceable;

public class Test {
    public static void main(String[] args) {
        Apartment flat = new Apartment(70000);
        Goods after_shop = new Goods(2000);
        Taxes taxes = new Taxes(1000);

        Priceable[] prices = {flat, after_shop, taxes};

        for(Priceable i: prices) {
            System.out.println(i.getPrice());
        }
    }
}
