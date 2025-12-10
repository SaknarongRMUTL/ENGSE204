package LAB2_05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        Rectangle data = new Rectangle(width, height);
        System.out.println(data.getArea());
        System.out.println(data.getPerimeter());
        input.close();
    }
}