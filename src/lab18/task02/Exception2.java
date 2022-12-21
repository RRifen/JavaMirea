package lab18.task02;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }

    public static void main(String[] args) {
        Exception2 ex = new Exception2();
        ex.exceptionDemo();
    }

    //Qwerty - NumberFormatException
    //0 - ArithmeticException
    //1.2 - NumberFormatException
    //1 - все нормально, если с точкой то NumberFormatException
}
