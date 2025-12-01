package LAB2_04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int mid = input.nextInt();
        int fin = input.nextInt();
        Student data = new Student(name, mid, fin);
        data.displaySummary();
        input.close();
    }
}