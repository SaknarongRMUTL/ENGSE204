package LAB5_12;
import java.util.Scanner;
class Service {
    protected String name;
    protected double basePrice;
    public Service(String name, double basePrice) {
        this.setName(name);
        this.setBasePrice(basePrice);
    }
    public double calculateFinalPrice() {
        return basePrice;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }
    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}
class PremiumService extends Service {
    protected double premiumRate;
    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.setPremiumRate(premiumRate);
    }
    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + getPremiumRate());
    }
    public void setPremiumRate(double premiumRate) {
        this.premiumRate = premiumRate;
    }
    public double getPremiumRate() {
        return premiumRate;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        double basePrice1 = input.nextDouble();
        input.nextLine();
        BasicService basicService = new BasicService(name1, basePrice1);
        String name2 = input.nextLine();
        double basePrice2 = input.nextDouble();
        double premiumRate = input.nextDouble();
        input.nextLine();
        PremiumService premiumService = new PremiumService(name2, basePrice2, premiumRate);
        Service[] services = {basicService, premiumService};
        for (Service service : services) {
            System.out.println(service.calculateFinalPrice());
        }
        input.close();
    }
}