package LAB5_07;
import java.util.Scanner;
class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary) {
        this.setName(name);
        this.setBaseSalary(baseSalary);   
    }
    public double calculatePay() {
        return baseSalary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
class SalesEmployee extends Employee {
    protected double commissionRate;
    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.setCommissionRate(commissionRate);
    }
    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
class Manager extends Employee {
    protected double fixedBonus;
    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.setBonus(fixedBonus);
    }
    @Override
    public double calculatePay() {
        return baseSalary + this.fixedBonus;
    }
    public void setBonus(double bonus) {
        this.fixedBonus = bonus;
    }
}
class PayrollProcessor {
    public static void process(Employee e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        double baseSalary1 = input.nextDouble();
        double commissionRate = input.nextDouble();
        input.nextLine();
        SalesEmployee saleseemployee = new SalesEmployee(name1, baseSalary1, commissionRate);
        String name2 = input.nextLine();
        double baseSalary2 = input.nextDouble();
        double fixedBonus = input.nextDouble();
        Manager manager = new Manager(name2, baseSalary2, fixedBonus);
        PayrollProcessor.process(saleseemployee);
        PayrollProcessor.process(manager);
        input.close();
    }
}