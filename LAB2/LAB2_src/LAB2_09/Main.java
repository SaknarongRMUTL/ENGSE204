package LAB2_09;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String street = input.nextLine();
        String city = input.nextLine();
        String zip = input.nextLine();
        Address datahome = new Address(street, city, zip);
        Student data = new Student(name, datahome);
        data.displayProfile();
        input.close();
    }
}