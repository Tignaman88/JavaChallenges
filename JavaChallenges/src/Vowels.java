public class Vowels {
    //return the number of vowels given in a string
    public static int getCount(String str) {
        int vowelCounter = 0;
        for(int i = 0; i <= str.length() - 1; i++) {
            switch (str.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    vowelCounter++;
                    break;
            }
        }

        return vowelCounter;
    }

}
