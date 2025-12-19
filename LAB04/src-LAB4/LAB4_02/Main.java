package LAB4_02;
import java.util.Scanner;
class Product {
	private String name;
	private double price;
	public Product(String name) {
		this(name , 0.0);
	}
	public Product(String name , double price) {
		this.name = name;
		this.price = price;
	}
	public void displayInfo() {
		System.out.printf("Product: %s, Price: %.2f\n", name ,price);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode = input.nextInt();
		input.nextLine();
		if (mode == 1){
			String name = input.nextLine();
			Product constructor1 = new Product(name);
			constructor1.displayInfo();
		}else if (mode == 2) {
			String name = input.nextLine();
			double price = input.nextDouble();
			Product constructor2 = new Product(name , price);
			constructor2.displayInfo();
		}
		input.close();
	}

}
