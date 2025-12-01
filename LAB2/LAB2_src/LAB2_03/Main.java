package LAB2_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        Student[] students = new Student[N];
        for (int i = 0; i < N; i++) {
            String id = input.nextLine();
            String name = input.nextLine();
            students[i] = new Student(id, name);
        }
        System.out.println(Student.studentCount);
        input.close();
    }
}
