package LAB2_06;
public class BankAccount {
    private String ownerName;
    private double balance;
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}