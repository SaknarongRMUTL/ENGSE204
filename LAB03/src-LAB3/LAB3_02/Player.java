package LAB3_02;

public class Player {
	private int score;
	public Player(int initialScore) {
		this.score = initialScore;
	}
	public int getScore() {
        return score;
    }
	public void setScore(int newScore) {
        this.score = newScore;
    }
}
