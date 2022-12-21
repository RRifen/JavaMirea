package lab30;

public final class Drink extends MenuItem implements Alcoholable {
    private DrinkTypeEnum type;
    private double alcoholVol;

    public DrinkTypeEnum getType() {
        return type;
    }

    public Drink(int cost, String name, String description, DrinkTypeEnum type, double alcoholVol) {
        super(cost, name, description);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    @Override
    public boolean isAlcoholicDrink() {
        DrinkTypeEnum[] alcoholicDrinks = {DrinkTypeEnum.BEER,
                DrinkTypeEnum.WINE,
                DrinkTypeEnum.VODKA,
                DrinkTypeEnum.BRANDY,
                DrinkTypeEnum.CHAMPAGNE,
                DrinkTypeEnum.WHISKEY,
                DrinkTypeEnum.TEQUILA,
                DrinkTypeEnum.RUM,
                DrinkTypeEnum.VERMOUTH,
                DrinkTypeEnum.LIQUEUR,
                DrinkTypeEnum.JAGERMEISTER};
        for (DrinkTypeEnum alcoholicDrink : alcoholicDrinks) {
            if (alcoholicDrink == type) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
