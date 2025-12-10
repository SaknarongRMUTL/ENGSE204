package LAB3_05;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputConnectionString = input.nextLine();
        DatabaseConnection db = new DatabaseConnection(inputConnectionString);
        db.connect(); 
        db.disconnect();
        db.disconnect();
        System.out.println(db.isConnected());
        input.close();
    }
}