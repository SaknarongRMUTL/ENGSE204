package LAB1;
import java.util.Scanner;
public class LAB1_12 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("กรอกจำนวนชนิดของสินค้า");
	        int limitinventory = input.nextInt(); 
	        int[] productID = new int[limitinventory];  
	        int[] productStock = new int[limitinventory];
	        for (int i = 0; i < limitinventory; i++) {
	        	System.out.println("ID ชิ้นที่ "+ (i+1));
	            productID[i] = input.nextInt();
	            System.out.println("Stock ชิ้นที่ "+ (i+1));
	            productStock[i] = input.nextInt();  
	        }//END FOR
	        System.out.println("รหัสที่ค้นหา");
	        boolean check = false;
	        int searchID = input.nextInt();   
	        for (int i = 0; i < limitinventory; i++) {
	            if (productID[i] == searchID) {
	            	System.out.println( "จำนวนคงคลัง" );
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