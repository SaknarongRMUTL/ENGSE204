package LAB2_03;
public class Student {
    String studentid;
    String name;
    static int studentCount = 0;
    public Student(String studentid, String name) {
        this.studentid = studentid;
        this.name = name;
        studentCount++;
    }
}