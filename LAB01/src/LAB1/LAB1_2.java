package LAB1;
import java.util.Scanner;
public class LAB1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		System.out.println( number1 * number2 );
		input.close();
	}//END MAIN
}