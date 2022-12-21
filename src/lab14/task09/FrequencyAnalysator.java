package lab14.task09;

import java.util.HashMap;
import java.util.regex.Pattern;

public class FrequencyAnalysator {
    public static void Analyse(String str) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        Pattern p = Pattern.compile("[a-zA-Z]");
        for(int i = 0; i < str.length(); i++) {
            String stringCharSmall = (str.charAt(i) + "").toLowerCase();
            char charSmall = stringCharSmall.charAt(0);
            if (p.matcher(stringCharSmall).matches()) {
                frequencies.put(charSmall, frequencies.containsKey(charSmall) ? frequencies.get(charSmall) + 1 : 1);
            }
        }
        int sum = 0;
        for(Character i : frequencies.keySet()) {
            sum += frequencies.get(i);
        }

        for(Character i : frequencies.keySet()) {
            System.out.println(i + "; ABsolute: " + frequencies.get(i) + "; Relative: " + (double)frequencies.get(i)/sum);
        }
    }
}
