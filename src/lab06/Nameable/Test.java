package lab06.Nameable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Person a = new Person("Jenya");
        Animal b = new Animal("Cow");
        Nameable[] names = {a, b};
        for(Nameable i: names) {
            System.out.println(i.getName());
        }
    }
}
