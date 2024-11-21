public class StringOptions {

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("lengthBuilder = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
