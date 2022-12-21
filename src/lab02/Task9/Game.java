package lab02.Task9;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.print("Введите количество игроков (не более 10): ");
        Scanner in = new Scanner(System.in);
        int count;
        count = in.nextInt();
        Poker poker = new Poker();
        poker.shuffle();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(poker.giveOutCard());
            }
            System.out.println();
        }
    }
}
