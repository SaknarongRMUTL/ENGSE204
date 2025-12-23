package LAB5_14;
import java.util.Scanner;
class Shipping {
    protected String trackingId;
    protected double baseFee;
    public Shipping(String trackingId, double baseFee) {
        this.setTrackingId(trackingId);
        this.setBaseFee(baseFee);
    }
    public double calculateTotalFee() {
        return baseFee;
    }
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }
    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }
}
class StandardShipping extends Shipping {
    public StandardShipping(String trackingId, double baseFee) {
        super(trackingId, baseFee);
    }
    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}
class PremiumShipping extends Shipping {
    protected double insuranceFee;
    public PremiumShipping(String trackingId, double baseFee, double insuranceFee) {
        super(trackingId, baseFee);
        this.setInsuranceFee(insuranceFee);
    }
    @Override
    public double calculateTotalFee() {
        super.calculateTotalFee();
        return baseFee + insuranceFee;
    }
    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String trackingId1 = input.nextLine();
        double baseFee1 = input.nextDouble();
        input.nextLine();
        StandardShipping standardShipping = new StandardShipping(trackingId1, baseFee1);
        String trackingId2 = input.nextLine();
        double baseFee2 = input.nextDouble();
        double insuranceFee2 = input.nextDouble();
        PremiumShipping premiumShipping = new PremiumShipping(trackingId2, baseFee2, insuranceFee2);
        Shipping[] shippings = {standardShipping, premiumShipping};
        for (Shipping shipping : shippings) {
            System.out.println(shipping.calculateTotalFee());
        }
        input.close();
    }
}