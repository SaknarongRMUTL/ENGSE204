package LAB4_07;
import java.util.Scanner;
class Resource {
	private String id;
	public Resource(String id) {
		this.id = id;
		System.out.printf("Resource %s created.\n", id);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.printf("Resource %s finalized(destroyed).\n", id);
		super.finalize();
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id_1 = input.nextLine();
		String id_2 = input.nextLine();
		String id_3 = input.nextLine();
		Resource r1 = new Resource(id_1);
		Resource r2 = new Resource(id_2);
		Resource r3 = new Resource(id_3);
		r1 = null;
		r2 = null;
		System.gc();
		r3 = null;
		System.gc();
		input.close();
		
	}

}
