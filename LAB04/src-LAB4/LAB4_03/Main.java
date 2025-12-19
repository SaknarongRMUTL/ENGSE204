package LAB4_03;
import java.util.Scanner;
class Player {
	private String username;
	private int level;
	public Player() {
		this.username = "Guest";
		this.level = 1;
	}
	public Player(String username , int level) {
		this.username = username;
		this.level = level;
	}
	public void displayInfo() {
		System.out.printf("User: %s, Level: %d", username, level);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode = input.nextInt();
		input.nextLine();
		if (mode == 1) {
			Player constructor1 = new Player();
			constructor1.displayInfo();
		}else if (mode == 2) {
			String username = input.nextLine();
			int level = input.nextInt();
			Player constructor2 = new Player(username , level);
			constructor2.displayInfo();
		}
		input.close();
	}

}
