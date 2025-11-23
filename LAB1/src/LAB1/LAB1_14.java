package LAB1;
import java.util.Scanner;
public class LAB1_14 {
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	int R =input.nextInt();
            int C = input.nextInt();
            char[][] map = new char[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    map[i][j] = input.next().charAt(0);  
                }//END FOR
            }//END FOR
            int targetR = input.nextInt();
            int targetC = input.nextInt();
            if (map[targetR][targetC] == '*') {
                System.out.println("Mine");
            } else {
            	int count = 0;
            	for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                    	if (map[i][j] == '*') {
                    		count ++;
                        }//END IF
                    }//END FOR
                }//END FOR
                System.out.println(count);
            }//END IF
            input.close();
        }//END MAIN
    }