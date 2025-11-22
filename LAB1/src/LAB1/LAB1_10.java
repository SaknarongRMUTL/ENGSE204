package LAB1;
import java.util.Scanner;
public class LAB1_10 {
	public static double calculateArea(double width, double height) {
		double result = width * height;
        return result;
	}//END calculateArea
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double width = input.nextDouble();
		double height = input.nextDouble();
		double sum = calculateArea(width, height);
		System.out.println(sum);
		input.close();
	}//END MAIN
}