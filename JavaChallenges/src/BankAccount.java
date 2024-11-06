public class BankAccount {

    String accountNumber;
    double accountBalance;
    String customerName;
    String email;
    String phoneNumber;

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
