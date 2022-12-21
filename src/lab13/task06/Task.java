package lab13.task06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws FileNotFoundException {
        String file = args[0];

        Scanner in = null;
        try {
            in = new Scanner(new File(new File(".").getCanonicalPath() + "\\src\\lab13\\task06\\" + file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> words = new ArrayList<>();
        while(in.hasNext()) {
            words.add(in.next());
        }
        ArrayList<String> result = new ArrayList<>(words.size());
        ArrayList<ArrayList<String>> wasString = new ArrayList<>();
        for(int i = 0; i < words.size(); i++) {
            wasString.add(new ArrayList<String>());
        }
        boolean added = false;
        int wordsAll = words.size();
        for(int i = 0; i < wordsAll; i++) {
            for(int j = 0; j < words.size(); j++) {
                if (wasString.get(i).contains(words.get(j))) {
                    continue;
                }
                else if (i == 0) {
                    wasString.get(i).add(words.get(j));
                    result.add(words.remove(j));
                    added = true;
                    break;
                }
                else if (result.get(i - 1).charAt(result.get(i - 1).length() - 1) == words.get(j).charAt(0)) {
                    wasString.get(i).add(words.get(j));
                    result.add(words.remove(j));
                    added = true;
                    break;
                }
            }
            if (!added) {
                words.add(result.remove(i - 1));
                i = i - 2;
            }
            else {
                added = false;
            }
        }
        for(String word: result) {
            System.out.println(word);
        }
    }
}
