package LAB1;
import java.util.Scanner;
public class LAB1_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array = input.nextInt();
		int [] allarray = new int [array];
		for (int i = 0; i < allarray.length; i++) {
			int arraynum = input.nextInt();
			allarray[i] = arraynum;
		}//END FOR
		int max = allarray[0];
        for (int i = 1; i < allarray.length; i++) {
            if (allarray[i] > max) {
                max = allarray[i]; 
            }//END IF
        }//END FOR
        System.out.println( max );
        input.close();
	}//END MAIN
}