import java.util.Arrays;


public class Array_Challenge {

      public static void descendingArray() {

          int[] myIntArray = new int[5];
          for (int i = 0; i < myIntArray.length; i++) {

              myIntArray[i] = (int) (Math.random() * 100);
          }




          System.out.println(Arrays.toString(myIntArray));
          Arrays.sort(myIntArray);

          int[] descendingArray = new int[5];
          int counter = 0;

          for (int i = myIntArray.length - 1; i >= 0; i--) {

              descendingArray[counter] = myIntArray[i];
              counter++;
          }

         System.out.println(Arrays.toString(descendingArray));
    }




}

