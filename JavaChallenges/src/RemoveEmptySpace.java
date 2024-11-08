

public class RemoveEmptySpace {
    static String fullName = "Alessio Scarpello";

    public static void Test() {
        int lengthOfString = fullName.length();
        String sortedWord = "";
        for (int i = 0; i <=lengthOfString - 1; i++){

            if (fullName.charAt(i) == ' ') sortedWord = fullName.replace(" ", "");
        }

        System.out.println(sortedWord);
    }




}
