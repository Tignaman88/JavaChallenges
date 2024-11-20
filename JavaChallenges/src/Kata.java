public class Kata {

    //given a string, capitalise all vowels

    public static String swap(String st) {


        String capitalisedVowels = "";

        for (int i = 0; i <= st.length() - 1; i++) {

            switch (st.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    capitalisedVowels += Character.toUpperCase(st.charAt(i));
                    break;
                default:
                    capitalisedVowels += st.charAt(i);
                    break;
            }
        }
        return capitalisedVowels;
    }

}
