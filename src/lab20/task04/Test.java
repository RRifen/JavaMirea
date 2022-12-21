package lab20.task04;

public class Test {
    public static void main(String[] args) {
        //MinMax<Animal> minMax; - Error
        String[] strings = {"abc", "abb", "aaa"};
        MinMax<String> minMax = new MinMax<>(strings);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());
    }
}
