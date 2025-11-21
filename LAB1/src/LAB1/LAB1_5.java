package LAB1;
import java.util.Scanner;
public class LAB1_5 {
	public static void main(String[] args) {
		String one = "Americano";
		String two = "Latte";
		String three = "Espresso";
		String four = "Mocha";
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		if ( menu == 1 ) {
			System.out.print(one);
		}else if ( menu == 2 ) {
			System.out.print(two);
		}else if ( menu == 3 ) {
			System.out.print(three);
		}else if ( menu == 4 ) {
			System.out.print(four);
		}else {
			System.out.print("Invalid Menu");
		}//END IF
		input.close();
	}//END MAIN
}
