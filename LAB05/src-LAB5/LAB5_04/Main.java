package LAB5_04;
import java.util.Scanner;
class Vehicle {
    protected String color;
    public Vehicle(String color) {
        this.setcolor(color);
    }
    public void setcolor(String color) {
        this.color = color;
    }
}
class Car extends Vehicle {
    protected int wheels;
    public Car(String color, int wheels) {
        super(color);
        this.setWheels(wheels);
    }
    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color = input.nextLine();
        int wheels = input.nextInt();
        Car car = new Car(color, wheels);
        car.displayDetails();
        input.close();
    }
}
