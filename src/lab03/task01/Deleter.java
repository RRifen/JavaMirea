package lab03.task01;

import java.util.*;

public class Deleter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int max = 100;
        int min = 1;

        int count = sc.nextInt();
        int a[] = new int[count];

        for(int i = 0; i < count; i++) {
            a[i] = random.nextInt(max) + 1;
            System.out.println(a[i]);
        }
        System.out.println("Количество элементов: " + count);

        int toDelete = sc.nextInt();
        for(int i = 0; i < count; i++) {
            if (a[i] == toDelete) {
                for(int j = i; j < count - 1; j++) {
                    a[j] = a[j+1];
                }
                i--;
                count--;
            }
        }


        for(int i = 0; i < count; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Количество элементов: " + count);


        int toDeleteLast = sc.nextInt();
        for(int i = 0; i < count; i++) {
            if (a[i] % 10 == toDeleteLast) {
                for(int j = i; j < count - 1; j++) {
                    a[j] = a[j+1];
                }
                i--;
                count--;
            }
        }


        for(int i = 0; i < count; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Количество элементов: " + count);
    }
}

// Сгенерировать целочисленный массив (в массиве элемент от 0 до 100), количество элементов задаем сами, на вывод сам массив
//и колчество элементов в нем, удалить число и вывод массива без чисел и длину массива, получаем число и удаляем все числа
//которые оканчиваются на него


// Получет на ввод 2 числа, 1 - число которое будем переовдить изначально в 10 (не целое), второе число в какую переовдить, перевести, дополнительно указать в двоичной и 16-ричной