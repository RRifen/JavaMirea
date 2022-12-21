package lab18.task02;

import java.util.Scanner;

public class Exception3 {
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
        }
    }

    public static void main(String[] args) {
        Exception3 ex = new Exception3();
        ex.exceptionDemo();
    }
}
