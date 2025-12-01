package LAB2_08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mode = input.nextLine();
        double temp = input.nextDouble();
        if (mode.equals ("C_TO_F")) {
            System.out.println(TempConverter.celsiusToFahrenheit(temp));
        } else if (mode.equals ("F_TO_C")) {
            System.out.println(TempConverter.fahrenheitToCelsius(temp));
        }
        input.close();
    }
}