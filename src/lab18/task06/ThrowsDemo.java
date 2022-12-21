package lab18.task06;

import java.util.Scanner;

public class ThrowsDemo {

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string (0 - null): ");
        String str = in.nextLine();
        if (str.equals("0")) {
            str = null;
        }
        obj.printMessage(str);
    }
}
