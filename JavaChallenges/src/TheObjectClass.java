public class TheObjectClass {

    private String name;
    private int age;

    TheObjectClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
//        return "TheObjectClass{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

