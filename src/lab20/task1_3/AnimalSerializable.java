package lab20.task1_3;

import java.io.Serializable;

public class AnimalSerializable extends Animal implements Serializable {
    public AnimalSerializable(String name, int age) {
        super(name, age);
    }
}
