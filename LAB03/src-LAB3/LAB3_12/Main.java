package LAB3_12;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        if (scanner.hasNext()) {
	            String name = scanner.next();         
	            double salary = scanner.nextDouble(); 
	            double taxRate = scanner.nextDouble();
	            double raise = scanner.nextDouble();  
	            Employee emp = new Employee(name, salary);
	            System.out.println("Tax (Before): " + emp.calculateTax(taxRate));
	            emp.giveRaise(raise);
	            System.out.println("Tax (After): " + emp.calculateTax(taxRate));
	        }
	        scanner.close();
	    }
	}