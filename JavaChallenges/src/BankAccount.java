import java.security.PublicKey;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default Name", "Default Email", "Default Phone Number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email,
                       String phoneNumber) {
        System.out.println("Account constructors with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("574839", 600, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public  void depositing(double fundToDeposit) {
        this.accountBalance += fundToDeposit;
        System.out.println("Your new balance is £" + accountBalance );
    }

    public void withdrawing(double fundWithdrawn) {
        if(this.accountBalance - fundWithdrawn < 0) {
            System.out.println("Cannot withdrawn as it would take the balance to less than 0");
            return;
        }

        this.accountBalance -= fundWithdrawn;
        System.out.println("Your new balance is £" + accountBalance);
    }
}
