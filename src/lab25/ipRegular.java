package lab25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ipRegular {
    public static void main(String[] args) {
        String[] trueTests = {"127.0.0.1", "255.255.255.0", "0.0.0.0", "12.13.14.15", "255.255.255.255"};
        String[] falseTests = {"1300.6.7.8", "abc.def.gha.bcd", "123.456.789.0.6", "256.0.0.0", "127 0 0 1"};
        Pattern ipPattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$");
        for(String test : trueTests) {
            Matcher matcher = ipPattern.matcher(test);
            System.out.println(test + " : " + (matcher.matches() ? "true" : "false"));
        }
        for(String test : falseTests) {
            Matcher matcher = ipPattern.matcher(test);
            System.out.println(test + " : " + (matcher.matches() ? "true" : "false"));
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Введите IP для првоерки: ");
        String test = in.nextLine();
        Matcher matcher = ipPattern.matcher(test);
        System.out.println(test + " : " + (matcher.matches() ? "true" : "false"));
    }
}
