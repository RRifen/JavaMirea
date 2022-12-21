package lab29.Task6;

public final class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;

    Drink(double cost, String name, String description) {
        if (cost < 0 || name == null || description == null || name=="" || description=="") {
            throw new IllegalArgumentException("Нельзя создать объект с такими аргументами");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Drink{" +
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
