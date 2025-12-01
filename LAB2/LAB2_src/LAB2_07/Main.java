package LAB2_07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String owner = input.nextLine();
        double initial = input.nextDouble();
        double withdraw1 = input.nextDouble();
        double withdraw2 = input.nextDouble();
        BankAccount data = new BankAccount(owner, initial);
        data.withdraw(withdraw1);
        data.withdraw(withdraw2);
        data.displayBalance();
        input.close();
    }
}