public class Chocolate {

    //code wars challenge available at https://www.codewars.com/kata/534ea96ebb17181947000ada/java
    public static long breakChocolate(long n, long m) {
        if(n <= 0 || m <= 0) return 0;
        return n * m - 1;
    }
}
