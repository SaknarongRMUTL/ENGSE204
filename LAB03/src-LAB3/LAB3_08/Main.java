package LAB3_08;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameInput = input.nextLine();
        int stockInput = input.nextInt();
        InventoryItem item = new InventoryItem(nameInput, stockInput);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String command = input.next();
            int amount = input.nextInt();
            if (command.equalsIgnoreCase("ADD")) {
                item.addStock(amount);
            } else if (command.equalsIgnoreCase("SELL")) {
                item.sellStock(amount);
            }
        }
        System.out.println("Final Stock: " + item.getStock());
        input.close();
    }
}