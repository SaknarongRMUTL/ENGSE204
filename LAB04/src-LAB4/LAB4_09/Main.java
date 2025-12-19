package LAB4_09;
import java.util.Scanner;
class ImmutableAccount {
	private final String accountId;
	private final double balance;
	public ImmutableAccount(String accountId, double balance) {
		this.accountId = accountId;
		if (balance < 0) {
			this.balance = 0.0;
		} else {
		this.balance = balance;
		}
	}
	public ImmutableAccount(ImmutableAccount other){
		this.accountId = other.accountId;
		this.balance = other.balance;
	}
	public String getAccountId() {
		return accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void displayInfo() {
		System.out.println("ID: " + accountId +", Balance: "+balance);
		}
	public ImmutableAccount deposit(double amount) {	
		if (amount > 0) {
            return new ImmutableAccount(this.accountId, this.balance + amount);
        } else {
            System.out.println("Invalid deposit amount.");
            return this;
        }
	}
	public ImmutableAccount withdraw(double amount) {
		if (amount > 0 && amount <= this.balance) {
            return new ImmutableAccount(this.accountId, this.balance - amount);
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return this;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String ID = input.nextLine();
		double startmonny = input.nextDouble();
		double safemonny = input.nextDouble();
		double outmonny = input.nextDouble();
		ImmutableAccount acc1 = new ImmutableAccount(ID, startmonny);
		ImmutableAccount acc2 = acc1.deposit(safemonny);
		ImmutableAccount acc3 = acc2.withdraw(outmonny);
		acc1.displayInfo();
		acc3.displayInfo();
		input.close();
	}
}