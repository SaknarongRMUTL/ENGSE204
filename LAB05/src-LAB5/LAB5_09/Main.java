package LAB5_09;
import java.util.Scanner;
class Item {
    protected String name;
    public Item(String name) {
        this.setName(name);
    }
    public double getValue() {
        return 0.0;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;
    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.setUnitPrice(unitPrice);
        this.setQuantity(quantity);
    }
    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;
    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.setMonthlyFee(monthlyCost);
        this.setMonths(months);
    }
    @Override
    public double getValue() {
        return monthlyCost * months;
    }
    public void setMonthlyFee(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }
    public void setMonths(int months) {
        this.months = months;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();
        input.nextLine();
        PhysicalProduct product = new PhysicalProduct(name1, unitPrice, quantity);
        String name2 = input.nextLine();
        double monthlyCost = input.nextDouble();
        int months = input.nextInt();
        input.nextLine();
        DigitalSubscription subscription = new DigitalSubscription(name2, monthlyCost, months);
        Item[] items = {product, subscription};
        double Totalvalue = 0.0;
        for (Item item : items) {
             Totalvalue += item.getValue();
        }
        System.out.println(Totalvalue);
        input.close();
    }
}