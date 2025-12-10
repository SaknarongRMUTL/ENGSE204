package LAB3_01;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String inputname = input.nextLine();
		User nameprivate = new User(inputname);
		System.out.println(nameprivate.getUsername());
		input.close();
	}
}