package LAB1;
import java.util.Scanner;
public class LAB1_1 {
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		number2 = input.nextInt();
		System.out.println("---------------");
		System.out.println(number1 + number2);
		input.close();
	}//END MAIN
}