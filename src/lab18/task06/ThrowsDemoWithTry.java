package lab18.task06;

import java.util.Scanner;

public class ThrowsDemoWithTry {
    public void printMessage(String key) {
        String message = "";
        try {
            message = getDetails(key);
        } catch (Exception e) {
            System.out.println("Исключение в методе printMessage");
            message = getDetails("0");
        }
        finally {
            System.out.println( message );
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemoWithTry obj = new ThrowsDemoWithTry();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string (0 - null): ");
        String str = in.nextLine();
        if (str.equals("0")) {
            str = null;
        }
        obj.printMessage(str);
    }
}
