package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class SuffPref {

    public static int solve(String s) {

        //validation
        if (s.length() == 1) return 0;

        //split the strings into parts
        int maxLengthSuffixOrPrefix = s.length() / 2;
        String[] parts;
        if (s.length() % 2 == 0) {
            parts = new String[]{s.substring(0, maxLengthSuffixOrPrefix), s.substring(maxLengthSuffixOrPrefix)};
        } else {
            parts = new String[]{s.substring(0, maxLengthSuffixOrPrefix), s.substring(maxLengthSuffixOrPrefix + 1)};
        }




        //Assign the parts
        String prefix = parts[0];
        String suffix = parts[1];


        //creates the lists we need
        ArrayList<Character> prefixList = new ArrayList<>();
        ArrayList<Character> suffixList = new ArrayList<>();

        //separate the chars to the lists
        char[] separatedPrefix = prefix.toCharArray();
        char[] separatedSuffix = suffix.toCharArray();

        //assigns the chars to the lists
        for (char letter : separatedPrefix) {
            prefixList.add(letter);
        }

        for (char letter : separatedSuffix) {
            suffixList.add(letter);
        }

        //to iterate through words
        int j = 0;
        for (int i = prefixList.size() - 1; i >= 0; i--) {
            if (prefixList.toString().contentEquals(suffixList.toString())) {
                return prefixList.size();
            } else {
                prefixList.remove(i);
                suffixList.remove(j);
            }

        }

        return 0;
    }
    }


