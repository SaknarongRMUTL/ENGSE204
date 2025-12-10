package LAB3_13;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                String command = scanner.next();
                if (command.equals("SET")) {
                    if (scanner.hasNextInt()) {
                        int newMax = scanner.nextInt();
                        LicenseManager.setMax(newMax);
                    }
                } 
                else if (command.equals("CHECKOUT")) {
                    LicenseManager.checkOut();
                } 
                else if (command.equals("CHECKIN")) {
                    LicenseManager.checkIn();
                } 
                else if (command.equals("STATUS")) {
                    LicenseManager.displayStatus();
                }
            }
        }
        scanner.close();
    }
}