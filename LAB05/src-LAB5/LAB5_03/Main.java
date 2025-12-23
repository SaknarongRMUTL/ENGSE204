package LAB5_03;
import java.util.Scanner;
class Employee {
    protected double salary;
    public double calculateBonus() {
        return salary * 10 / 100;
    }
}
class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (salary * 5 / 100);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager manager = new Manager();
        double salary = input.nextDouble();
        manager.salary = salary;
        System.out.println("Bonus: "+ manager.calculateBonus());
        input.close();
    }
}
