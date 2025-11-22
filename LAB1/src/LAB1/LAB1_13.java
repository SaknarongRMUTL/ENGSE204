package LAB1;
import java.util.Scanner;
public class LAB1_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int R = input.nextInt();  
        int C = input.nextInt();  
        int[][] grid = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = input.nextInt();
            }//END FOR (C)
        }//END FOR (R)
        int nubonline = 0; 
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    nubonline++;
                }//END IF 
            }//END FOR (C)
        }//END FOR (R)
        System.out.println(nubonline);
        input.close();
    }//END MAIN
}