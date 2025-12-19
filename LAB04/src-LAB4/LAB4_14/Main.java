package LAB4_14;
import java.util.Scanner;
class ScoreBoard {
    private final String gameName;
    private final int[] scores;
    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores;
    }
    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }
    public void displayScores() {
        System.out.print(this.gameName + ": ");
        for (int i = 0; i < this.scores.length; i++) {
            System.out.print(this.scores[i]);
            if (i < this.scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gameName = scanner.nextLine();
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int newValue = scanner.nextInt();
        int[] originalScores = {s1, s2, s3};
        ScoreBoard sb1 = new ScoreBoard(gameName, originalScores);
        ScoreBoard sb2 = new ScoreBoard(sb1);
        originalScores[0] = newValue;
        sb1.displayScores();
        sb2.displayScores();
        scanner.close();
    }
}