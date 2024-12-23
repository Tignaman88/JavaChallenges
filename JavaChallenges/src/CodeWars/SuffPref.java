package CodeWars;

import java.util.Arrays;

public class SuffPref {

    public static int solve(String s) {


        char[] dividedString = s.toCharArray();
        String suffix = "";
        String prefix = "";

        int reverseArrayStartingPoint = s.length() - 1;

        for (int i = 0; i <= s.length() - 1; i++) {

            prefix += dividedString[i];
            suffix += dividedString[reverseArrayStartingPoint];
            reverseArrayStartingPoint--;
        }



        //reverse the suffix

        String reversedSuffix = "";
        for (int j = suffix.length() - 1; j >= 0; j--) {

            reversedSuffix += suffix.charAt(j);
        }

        if (prefix.contentEquals(reversedSuffix)) {

            return reversedSuffix.length();
        }
        return reversedSuffix.length();
    }
}
