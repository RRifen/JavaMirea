package lab06.Task10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        int computersCount;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сколько компьютеров добавить: ");
        computersCount = in.nextInt();

        int brandChoice;
        Brands brand;
        String processorName;
        String memoryName;
        String monitorName;
        for(int i = 0; i < computersCount; i++) {
            System.out.print("Введите брэнд (1 - Asus, 2 - Lenovo, 3 - Apple, 4 - Dell, все остальное - Acer): ");
            brandChoice = in.nextInt();
            brand = switch (brandChoice) {
                case 1 -> Brands.ASUS;
                case 2 -> Brands.LENOVO;
                case 3 -> Brands.APPLE;
                case 4 -> Brands.DELL;
                default -> Brands.ACER;
            };
            System.out.print("Введите название процессора: ");
            processorName = in.next();
            System.out.print("Введите название памяти: ");
            memoryName = in.next();
            System.out.print("Введите название монитора: ");
            monitorName = in.next();
            shop.addComputer(processorName, memoryName, monitorName, brand);
        }

        shop.printComputers();

        System.out.println("Поиск компьютера");
        System.out.print("Введите брэнд (1 - Asus, 2 - Lenovo, 3 - Apple, 4 - Dell, все остальное - Acer): ");
        brandChoice = in.nextInt();
        brand = switch (brandChoice) {
            case 1 -> Brands.ASUS;
            case 2 -> Brands.LENOVO;
            case 3 -> Brands.APPLE;
            case 4 -> Brands.DELL;
            default -> Brands.ACER;
        };
        System.out.print("Введите название процессора: ");
        processorName = in.next();
        System.out.print("Введите название памяти: ");
        memoryName = in.next();
        System.out.print("Введите название монитора: ");
        monitorName = in.next();
        if (shop.findComputer(processorName, memoryName, monitorName, brand) != null) {
            System.out.println("Компьютер в наличии");
        }
        else {
            System.out.println("Компьютера нет в наличии");
        }

        shop.printComputers();

        System.out.println("Удаление компьютера");
        System.out.print("Введите брэнд (1 - Asus, 2 - Lenovo, 3 - Apple, 4 - Dell, все остальное - Acer): ");
        brandChoice = in.nextInt();
        brand = switch (brandChoice) {
            case 1 -> Brands.ASUS;
            case 2 -> Brands.LENOVO;
            case 3 -> Brands.APPLE;
            case 4 -> Brands.DELL;
            default -> Brands.ACER;
        };
        System.out.print("Введите название процессора: ");
        processorName = in.next();
        System.out.print("Введите название памяти: ");
        memoryName = in.next();
        System.out.print("Введите название монитора: ");
        monitorName = in.next();
        if (shop.deleteComputer(processorName, memoryName, monitorName, brand)) {
            System.out.println("Компьютер был удален");
        }
        else {
            System.out.println("Компьютера изначально не было, поэтому удаления не произошло");
        }

        shop.printComputers();
    }
}
