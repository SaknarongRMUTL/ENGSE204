package LAB1;
import java.util.Scanner;
public class LAB1_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array = input.nextInt();
		int [] allarray = new int [array];
		for (int i = 0; i < allarray.length; i++) {
			int arraynum = input.nextInt();
			allarray[i] = arraynum;
		}//END FOR
		int sum = 0;
        for (int i = 0; i < allarray.length; i++) {
        	sum += allarray[i];
        }//END FOR
        double average = (double) sum / allarray.length;
        System.out.println(average);
        input.close();
	}//END MAIN
}