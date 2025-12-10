package LAB3_04;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String productName = input.nextLine();
            new Product(productName);
        }
        System.out.println(Product.getProductCount());
        input.close();
    }
}