package lab06.Task11;

public class Kelvin implements  Convertable {
    @Override
    public double convert(double startValue) {
        return startValue + 273.15;
    }
}
