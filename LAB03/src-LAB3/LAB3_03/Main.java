package LAB3_03;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String initialPass = input.nextLine();
        String newPass = input.nextLine();
        User user = new User(initialPass);
        user.setPassword(newPass);
        System.out.println(user.getPassword());
        input.close();
    }
}