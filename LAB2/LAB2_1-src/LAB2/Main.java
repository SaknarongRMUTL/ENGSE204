package LAB2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String id = input.nextLine();
        String name = input.nextLine();
        Student s = new Student(id, name);
        s.show();
        input.close();
	}
}