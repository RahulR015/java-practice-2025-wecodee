public class BankAccount {
    private long accountNumber;
    private double balance;
    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void deposit(String amount) {
        if (amount != null) {
            balance += Double.parseDouble(amount);
            System.out.println("Deposited: " + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
        else  {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public double getBalance() {

        return balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
}
