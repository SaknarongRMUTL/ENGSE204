package LAB4_08;
import java.util.Scanner;
class Movie {
	private String title;
	private String director;
	private double rating;
	public Movie(String title) {
		this(title, "Unknown", 0.0);
	}
	public Movie(String title, String director) {
		this(title, director, 0.0);
	}
	public Movie(String title, String director, double rating) {
		this.title = title;
		this.director = director;
		if (rating < 0.0) {
			rating = 0;
		}if(rating > 10.0) {
			rating = 10.0;
		}
		this.rating = rating;
	}
	public void diplayDetails() {
		System.out.println("Title: " + title +", Director: " + director + ", Rating: " + rating);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode = input.nextInt();
		input.nextLine();
		if (mode == 1) {
			String title = input.nextLine();
			Movie showtitle = new Movie(title);
			showtitle.diplayDetails();
		}else if (mode == 2) {
			String title = input.nextLine();
			String director = input.nextLine();
			Movie showtitle = new Movie(title, director);
			showtitle.diplayDetails();
		}else if (mode == 3){
			String title = input.nextLine();
			String director = input.nextLine();
			double rating = input.nextDouble();
			Movie showtitle = new Movie(title, director, rating);
			showtitle.diplayDetails();
		}else {
			System.out.println("Error plssss 1-3");
		}
		input.close();
	}

}
