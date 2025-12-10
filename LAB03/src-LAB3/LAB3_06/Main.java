package LAB3_06;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialInput = input.nextDouble();
        double depositInput = input.nextDouble();
        double withdrawInput = input.nextDouble();
        BankAccount myAccount = new BankAccount(initialInput);
        myAccount.deposit(depositInput);
        myAccount.withdraw(withdrawInput);
        System.out.println("Final Balance: " + myAccount.getBalance());
        input.close();
    }
}