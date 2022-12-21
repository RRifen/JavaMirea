package lab20.task04_2;

public class Calculator {
    public static <T extends Number> double sum(T numberOne, T numberTwo) {
        return numberOne.doubleValue() + numberTwo.doubleValue();
    }

    public static <T extends Number> double sub(T numberOne, T numberTwo) {
        return numberOne.doubleValue() - numberTwo.doubleValue();
    }

    public static <T extends Number> double mul(T numberOne, T numberTwo) {
        return numberOne.doubleValue() * numberTwo.doubleValue();
    }

    public static <T extends Number> double div(T numberOne, T numberTwo) {
        return numberOne.doubleValue() / numberTwo.doubleValue();
    }
}
