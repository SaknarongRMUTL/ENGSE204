package LAB3_07;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String idInput = input.nextLine();
        String deptInput = input.nextLine();
        String newDeptInput = input.nextLine();
        Employee emp = new Employee(idInput, deptInput);
        emp.setDepartment(newDeptInput);
        System.out.println(emp.getEmployeeId()); 
        System.out.println(emp.getDepartment());
        input.close();
    }
}