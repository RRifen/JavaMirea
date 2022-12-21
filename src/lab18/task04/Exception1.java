package lab18.task04;

import java.util.Scanner;

public class Exception1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("Сообщение выводится всегда в конце блока try-catch");
        }
    }

    public static void main(String[] args) {
        Exception1 ex = new Exception1();
        ex.exceptionDemo();
    }
}
