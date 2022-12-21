package lab29.Task3;

public final class Dish implements Item {
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

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
