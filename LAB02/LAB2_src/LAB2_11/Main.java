package LAB2_11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        int year = input.nextInt();
        int newYear = input.nextInt();
        Car datacar = new Car(model, year);
        datacar.setYear(newYear);
        System.out.println("Model: " + datacar.getModel());
        System.out.println("Year: " + datacar.getYear());
        input.close();
    }
}