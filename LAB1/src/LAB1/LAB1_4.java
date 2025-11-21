package LAB1;
import java.util.Scanner;
public class LAB1_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		if ( score > 100 || score < 0 ) {
			System.out.print("Enter Score (0-100)");
		}else if ( score >= 80 ) {
			System.out.print("A");
		}else if ( score >= 70 ) {
			System.out.print("B");
		}else if ( score >= 60 ) {
			System.out.print("C");
		}else if ( score >= 50 ) {
			System.out.print("D");
		}else if (score >= 0 ){
			System.out.print("F");
		}//END IF
		input.close();
	}//END MAIN
}