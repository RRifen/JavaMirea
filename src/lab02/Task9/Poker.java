package lab02.Task9;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    private final String[] suits = {"♠", "♥", "♣", "♦"};
    private final String[] values = {"Т" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К"};
    private final ArrayList<String> deck = new ArrayList<String>();

    public void createDeck() {
        for (String suit : suits) {
            for (String value : values) {
                deck.add(value + suit);
            }
        }
    }

    Poker() {
        createDeck();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public String giveOutCard() {
        return deck.remove(0);
    }

    public void outputDeck() {
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.get(i));
        }
    }
}
