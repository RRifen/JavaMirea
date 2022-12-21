package lab02.Task5;

public class Dog {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int toManAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog {name: " + name + "; age: " + age + "}";
    }


}
