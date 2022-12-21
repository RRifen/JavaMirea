package lab18.task07;

import java.util.Scanner;

public class ThrowDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) {
        if(key.equals("")) {
            //throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }

    public static void main(String[] args) {
        ThrowDemo obj = new ThrowDemo();
        obj.getKey();
    }
}
