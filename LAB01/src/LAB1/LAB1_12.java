package LAB1;
import java.util.Scanner;
public class LAB1_12 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int limitinventory = input.nextInt(); 
	        int[] productID = new int[limitinventory];  
	        int[] productStock = new int[limitinventory];
	        for (int i = 0; i < limitinventory; i++) {
	            productID[i] = input.nextInt();
	            productStock[i] = input.nextInt();  
	        }//END FOR
	        boolean check = false;
	        int searchID = input.nextInt();   
	        for (int i = 0; i < limitinventory; i++) {
	            if (productID[i] == searchID) {
	                System.out.println(productStock[i]);
	                check = true;
	            }//END IF
	        }//END FOR
	        if (!check) {
	        	System.out.println("Product "+ searchID + " not found");
	        }//END IF
	        input.close();
	    }//END MAIN
	}