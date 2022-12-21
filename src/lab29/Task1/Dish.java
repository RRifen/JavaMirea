package lab29.Task1;

public final class Dish {
    private final double cost;
    private final String name;
    private final String description;

    Dish(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cost=" + cost + "; " +
                "name='" + name + '\'' + "; " +
                "description='" + description + '\'' +
                '}';
    }
}
