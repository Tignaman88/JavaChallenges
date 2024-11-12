public class Main {
    public static void main(String[] args) {
//          BankAccount AlessioScarpello = new BankAccount("12345", 5.00, "Alessio Scarpello",
//                  "alessio@yahoo.it", "05557830923");
//        BankAccount AlessioScarpello = new BankAccount();
//        System.out.println(AlessioScarpello.getAccountNumber());
//        System.out.println(AlessioScarpello.getAccountBalance());
//        AlessioScarpello.setAccountBalance(5.45);
//        AlessioScarpello.setCustomerName("Alessio Scarpello");
//        AlessioScarpello.depositing(1000);
//        AlessioScarpello.withdrawing(2000);
//        BankAccount Mav = new BankAccount();
//        Mav.setAccountBalance(7000);
//        Mav.depositing(300);
//        Mav.withdrawing(3067.99);

//      SimpleCalculator calculator = new SimpleCalculator();
//      calculator.setFirstNumber(5.0);
//      calculator.setSecondNumber(4);
//      System.out.println(calculator.getAdditionResult());
//      System.out.println(calculator.getSubtractionResult());
//      System.out.println(calculator.getMultiplicationResult());
//      System.out.println(calculator.getDivisionResult());

//        Person Alessio = new Person();
//        Alessio.setAge(190);
//        System.out.println(Alessio.getAge());
//        RemoveEmptySpace.Test();
//        System.out.println(QuarterOfTheYear.quarterOf(4));
//      System.out.println(WillYouMakeIt.zeroFuel(45, 25, 2));

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    }
}
