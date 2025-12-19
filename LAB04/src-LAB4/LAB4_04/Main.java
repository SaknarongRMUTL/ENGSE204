package LAB4_04;
import java.util.Scanner;
class Location {
	private double latitude;
	private double longitude;
	public Location(double latitude , double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Location(Location other) {
		this.latitude = other.latitude;
		this.longitude = other.longitude;
	}
	public void setLatitude(double newLat) {
		this.latitude = newLat;
	}
	public void displayInfo() {
		System.out.println("Lat: " + this.latitude + ", Lon: " + this.longitude);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double latitude = input.nextDouble();
		double longitude = input.nextDouble();
		double newLat = input.nextDouble();
		Location loc1 = new Location(latitude , longitude);
		Location loc2 = new Location(loc1);
		loc1.setLatitude(newLat);
		loc1.displayInfo();
		loc2.displayInfo();
		input.close();
	}

}
