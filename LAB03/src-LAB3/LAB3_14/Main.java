package LAB3_14;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = null;
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                String command = scanner.next();
                if (command.equals("CREATE")) {
                    double initialDeposit = scanner.nextDouble();
                    myAccount = new BankAccount(initialDeposit);
                } 
                else if (command.equals("DEPOSIT")) {
                    double amount = scanner.nextDouble();
                    if (myAccount != null) {
                        myAccount.deposit(amount);
                    } else {
                        System.out.println("No account exists.");
                    }
                } 
                else if (command.equals("WITHDRAW")) {
                    double amount = scanner.nextDouble();
                    if (myAccount != null) {
                        myAccount.withdraw(amount);
                    } else {
                        System.out.println("No account exists.");
                    }
                } 
                else if (command.equals("STATUS")) {
                    if (myAccount != null) {
                        System.out.println("Balance: " + myAccount.getBalance());
                    } else {
                        System.out.println("No account exists.");
                    }
                } 
                else if (command.equals("GLOBAL_STATUS")) {
                    System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
                }
                else if (command.equals("GLOBAL")) {
                    String part2 = scanner.next();
                    System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
                }
            }
        }
        scanner.close();
    }
}