package LAB1;
import java.util.Scanner;
public class LAB1_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int enter = input.nextInt();
		for (int i = 1; i <= 12; i++ ) {
			System.out.println( enter + " x " + i + " = " + i * enter );
		}//END FOR
		input.close();
	}//END MAIN
}
