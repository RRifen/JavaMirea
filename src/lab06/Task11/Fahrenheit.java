package lab06.Task11;

public class Fahrenheit implements Convertable {
    @Override
    public double convert(double startValue) {
        return startValue * 1.8 + 32;
    }
}
