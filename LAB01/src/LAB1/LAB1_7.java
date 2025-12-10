package LAB1;
import java.util.Scanner;
public class LAB1_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nub = input.nextInt();
		int sum = 0;
		System.out.println("Please enter " + nub + " values");
		 for (int i = 0; i < nub; i++) {
	            int number = input.nextInt(); 
	            sum += number; 
	        }//END FOR
	        System.out.println(sum);
	        input.close();
	}//END MAIN
}