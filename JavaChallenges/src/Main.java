public class Main {
    public static void main(String[] args) {
        AllAboutStrings.printInformation("Hello World");
        AllAboutStrings.printInformation("");
        AllAboutStrings.printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }

        if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if(helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if(helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }
}