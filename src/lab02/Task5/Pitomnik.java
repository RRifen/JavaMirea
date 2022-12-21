package lab02.Task5;
import java.util.*;


public class Pitomnik {

    public static final ArrayList<Dog> dogs = new ArrayList<>();
    public static void addDogs(Dog... objects) {
        Collections.addAll(dogs, objects);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество собак: ");
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Введите имя собаки: ");
            String name = in.next();
            System.out.print("Введите возраст собаки: ");
            int age = in.nextInt();
            dogs.add(new Dog(name, age));
        }

        for (Dog dog : dogs) {
            System.out.println(dog);
            System.out.println("Человеческий возраст: " + dog.toManAge());
        }
        
        for (Dog dog : dogs) {
            dog.setName("Doggy");
        }
        
        for (Dog dog: dogs) {
            System.out.println(dog);
        }
    }
}
