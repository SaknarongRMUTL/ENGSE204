package LAB2_10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        ShoppingCart cart = new ShoppingCart();
        for (int i = 0; i < N; i++) {
            String name = input.nextLine();
            double price = input.nextDouble();
            input.nextLine();
            Product data = new Product(name, price);
            cart.addProduct(data);
        }
        System.out.println(cart.calculateTotalPrice());
        input.close();
    }
}