package LAB3_11;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                String command = scanner.next();
                if (command.equals("SET")) {
                    String subCommand = scanner.next(); 
                    command = "SET_" + subCommand;
                }
                SystemConfig config = SystemConfig.getInstance();
                if (command.equals("SET_URL")) {
                    String url = scanner.next();
                    config.setServerUrl(url);
                } else if (command.equals("SET_MAX")) {
                    if (scanner.hasNextInt()) {
                        int count = scanner.nextInt(); 
                        config.setMaxConnections(count);
                    } else {
                        scanner.next(); 
                        System.out.println("Invalid count input");
                    }
                } else if (command.equals("SHOW")) {
                    System.out.println("URL: " + config.getServerUrl());
                    System.out.println("MAX: " + config.getMaxConnections());
                }
            }
        }
        scanner.close();
    }
}