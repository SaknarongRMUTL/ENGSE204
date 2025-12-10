package LAB3_15;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String username = scanner.next();
            User currentUser = new User(username);
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();

                for (int i = 0; i < n; i++) {
                    String command = scanner.next();
                    if (command.equals("SET")) {
                        String part2 = scanner.next();
                        command = "SET_" + part2; 
                    }

                    if (command.equals("SET_POLICY")) {
                        if (scanner.hasNextInt()) {
                            int newMax = scanner.nextInt();
                            User.setPolicy(newMax); 
                        }
                    } 
                    else if (command.equals("LOGIN")) {
                        String password = scanner.next();
                        currentUser.login(password); 
                    }
                }
            }
        }
        scanner.close();
    }
}