package LAB1;
import java.util.Scanner;
public class LAB1_11 {
	public static int sumArray(int [] allarray, int maxarray) {
		int sum = 0;
		for (int i = 0; i < maxarray; i++) {
			sum += allarray[i];
		}//END FOR
		return sum;
	}//END SUMARRAY
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int maxarray = input.nextInt();
		int [] allarray = new int [maxarray];
		for (int i = 0; i < maxarray; i++ ) {
			int numarray = input.nextInt();
			allarray[i] = numarray;
		}//END FOR
		int outArray = sumArray(allarray , maxarray);
		System.out.println(outArray);
		input.close();
	}//END MAIN
}