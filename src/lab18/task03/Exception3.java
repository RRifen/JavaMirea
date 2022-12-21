package lab18.task03;

import java.util.Scanner;

public class Exception3 {

    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Исключение");
        }
    }

    public static void main(String[] args) {
        lab18.task03.Exception3 ex = new lab18.task03.Exception3();
        ex.exceptionDemo();
    }
}
