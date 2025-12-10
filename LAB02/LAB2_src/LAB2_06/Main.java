package LAB2_06;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String owner = input.nextLine();
        double initial = input.nextDouble();
        double amount = input.nextDouble();
        BankAccount data = new BankAccount(owner, initial);
        data.deposit(amount);
        data.displaySummary();
        input.close();
    }
}