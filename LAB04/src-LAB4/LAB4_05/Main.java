package LAB4_05;
import java.util.Scanner;
class Color {
	private int red;
	private int green;
	private int blue;
	public Color (int r, int g, int b) {
		if (r < 0) {
			r = 0;
		}if (r > 255) {
			r = 255;
		}if (g < 0) {
			g = 0;
		}if (g > 255) {
			g = 255;
		}if (b < 0) {
			b = 0;
		}if (b > 255) {
			b = 255;
		}
		this.red = r;
		this.green = g;
		this.blue = b;
	}
	public int getRed() {
		return red;
	}
	public int getGreen() {
		return green;
	}
	public int getBlue() {
		return blue;
	}
	public void displayRGB() {
		System.out.printf("R=%d,G=%d,B=%d\n", red, green, blue);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int g = input.nextInt();
		int b = input.nextInt();
		Color allcolor = new Color(r, g, b);
		allcolor.displayRGB();
		input.close();
	}
}
