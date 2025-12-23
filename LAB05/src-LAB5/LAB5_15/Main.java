package LAB5_15;
import java.util.Scanner;
class RentalVehicle {
    protected String model;
    protected double rentalRate;
    public RentalVehicle(String model, double rentalRate) {
        this.setModel(model);
        this.setRentalRate(rentalRate);
    }
    public double calculateFee() {
        return rentalRate;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}
class Car extends RentalVehicle {
    public Car(String model, double rentalRate)  {
        super(model, rentalRate);
    }
    @Override
    public double calculateFee() {
        return rentalRate + 100.0; 
    }
}
class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }
    @Override
    public double calculateFee() {
        return rentalRate * 1.10; 
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String model1 = input.nextLine();
        double rentalRate1 = input.nextDouble();
        input.nextLine();
        Car car1 = new Car(model1, rentalRate1);
        String model2 = input.nextLine();
        double rentalRate2 = input.nextDouble();
        input.nextLine();
        Motorcycle motorcycle1 = new Motorcycle(model2, rentalRate2);
        RentalVehicle[] vehicles = {car1, motorcycle1};
        double TotalRentalFee = 0.0;
        for (RentalVehicle vehicle : vehicles) {
            TotalRentalFee += vehicle.calculateFee();
        }
        System.out.println(TotalRentalFee);
        input.close();
    }
}
