package LAB2_12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String courseId = input.nextLine();
        String courseName = input.nextLine();
        String studentName = input.nextLine();
        Course course = new Course(courseId, courseName);
        Student student = new Student(studentName, course);
        student.displayEnrollment();
        input.close();
    }
}