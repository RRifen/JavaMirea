package lab18.task07;

import java.util.Scanner;

public class ThrowDemoFixed {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key: ");
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Empty String");;
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }

    public static void main(String[] args) {
        ThrowDemoFixed obj = new ThrowDemoFixed();
        obj.getKey();
    }
}
