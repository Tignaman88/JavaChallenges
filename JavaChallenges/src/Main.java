public class Main {
    public static void main(String[] args) {
//        BankAccount AlessioScarpello = new BankAccount();
//        AlessioScarpello.setAccountBalance(5.45);
//        AlessioScarpello.setCustomerName("Alessio Scarpello");
//        AlessioScarpello.depositing(1000);
//        AlessioScarpello.withdrawing(2000);
//        BankAccount Mav = new BankAccount();
//        Mav.setAccountBalance(7000);
//        Mav.depositing(300);
//        Mav.withdrawing(3067.99);

      SimpleCalculator calculator = new SimpleCalculator();
      calculator.setFirstNumber(5.0);
      calculator.setSecondNumber(4);
      System.out.println(calculator.getAdditionResult());
      System.out.println(calculator.getSubtractionResult());
      System.out.println(calculator.getMultiplicationResult());
      System.out.println(calculator.getDivisionResult());
    }
}
