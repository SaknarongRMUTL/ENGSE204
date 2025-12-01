package LAB2_1;
public class Student {
	private String studentid;
	private String name;
	public Student(String studentid, String name) {
		this.studentid = studentid;
		this.name = name;
	}
	public void show() {
		System.out.println(this.studentid);
		System.out.println(this.name);
	}
}