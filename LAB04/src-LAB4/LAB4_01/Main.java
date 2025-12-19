package LAB4_01;
import java.util.Scanner;
class Book {
	private String title;
	private String author;
	public Book(String title) {
		this.title = title;
		this.author = "Unknown";
	}
	public Book(String title , String author) {
		this.title = title;
		this.author = author;
	}
	public void displayInfo() {
		System.out.printf("Title: %s, Author: %s\n" , title , author);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mode = input.nextInt();
		input.nextLine();
		if (mode == 1) {
            String title = input.nextLine();
            Book constructor1 = new Book(title);
            constructor1.displayInfo();
        } 
        else if (mode == 2) {
            String title = input.nextLine();
            String author = input.nextLine();
            Book constructor2 = new Book(title, author);
            constructor2.displayInfo();
        
		}
		input.close();
	}
}