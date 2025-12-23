package LAB5_08;
import java.util.Scanner;
class Person {
    protected String name;
    public Person(String name) {
        this.setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return "Person: " + name;
    }
}
class Student extends Person {
    protected int studentId;
    public Student(String name, int studentId) {
        super(name);
        this.setStudentId(studentId);
    }
    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
class Employee extends Person {
    protected double salary;
    public Employee(String name, double salary) {
        super(name);
        this.setSalary(salary);
    }
    public void applyBonus(double bonus) {
        this.salary += bonus;
    }
    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        int studentId = input.nextInt();
        input.nextLine();
        Student student = new Student(name1, studentId);
        String name2 = input.nextLine();
        double salary = input.nextDouble();
        Employee employee = new Employee(name2, salary);
        Person[] persons = {student, employee};
        for (Person person : persons) {
            if (person instanceof Employee) {
                Employee emp = (Employee) person;
                emp.applyBonus(1000.0);
            }
        }
        for (Person person : persons) {
            System.out.println(person.getStatus());
        }
        input.close();
    }
}