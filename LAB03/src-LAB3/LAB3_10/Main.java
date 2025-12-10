package LAB3_10;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                String command = scanner.next();
                if (command.equals("SET")) {
                    int newLevel = scanner.nextInt();
                    SystemLogger.setLogLevel(newLevel);
                } else if (command.equals("LOG")) {
                    int msgLevel = scanner.nextInt();
                    String message = scanner.nextLine().trim();
                    if (message.isEmpty()) {
                        message = scanner.nextLine().trim();
                    }
                    SystemLogger.log(msgLevel, message);
                }
            }
        }
        scanner.close();
    }
}