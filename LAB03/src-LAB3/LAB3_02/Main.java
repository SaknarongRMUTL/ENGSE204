package LAB3_02;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int initialScore = input.nextInt();
		int updatedScore = input.nextInt();
		Player inputplayer = new Player(initialScore);
		inputplayer.setScore(updatedScore);
		System.out.println(inputplayer.getScore());
        input.close();
	}
}