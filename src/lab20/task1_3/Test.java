package lab20.task1_3;

public class Test {
    public static void main(String[] args) {
        Generalized<Integer, AnimalSerializable, Animal> generalized = new Generalized<>(8, new AnimalSerializable("Cat", 3), new Animal("Bird", 1));
        generalized.printClassNames();
    }
}

