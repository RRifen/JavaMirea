package lab13.task03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите адрес одной строкой, разделитель только запятая (7 значений): ");
        String address = in.nextLine();
        Address address1 = new Address();
        address1.AddressSplit(address);
        System.out.println(address1);
        System.out.println("Введите адрес одной строкой, разделители точка, запятая, точка с запятой (7 значений): ");
        address = in.nextLine();
        address1.AddressTokenizer(address);
        System.out.println(address1);
    }
}
