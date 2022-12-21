package lab13.task04;

public class Shirt {
    private String number;
    private String name;
    private String color;
    private String size;


    public Shirt(String number, String name, String color, String size) {
        this.number = number;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Номер футболки: " + number + "\nНазвание: " + name + "\nЦвет: " + color + "\nРазмер: " + size;
    }
}
