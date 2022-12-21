package lab06.Task11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while(true) {
            double Celsius;
            System.out.print("Введите температуру в градусах Цельсия: ");

            Scanner in = new Scanner(System.in);
            Celsius = in.nextDouble();

            Kelvin kelvin = new Kelvin();
            Fahrenheit fahrenheit = new Fahrenheit();
            System.out.println(kelvin.convert(Celsius));
            System.out.println(fahrenheit.convert(Celsius));
        }
    }
}
