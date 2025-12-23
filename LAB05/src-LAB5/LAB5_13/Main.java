package LAB5_13;
import java.util.Scanner;
class User {
    protected String name;
    public User(String name) {
        this.setName(name);
    }
    public int getClearanceLevel() {
        return 1;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Developer extends User {
    protected int projects;
    public Developer(String name, int projects) {
        super(name);
        this.setProjects(projects);
    }
    @Override
    public int getClearanceLevel() {
        return 2;
    }
    public void setProjects(int projects) {
        this.projects = projects;
    }
}
class Admin extends Developer {
    protected String adminKey;
    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.setAdminKey(adminKey);
    }
    @Override
    public int getClearanceLevel() {
        return 3;
    }
    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }
    public String getAdminKey() {
        return adminKey;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        int projects1 = input.nextInt();
        input.nextLine();
        User u1 = new User("Guest");
        Developer d1 = new Developer(name1, projects1);
        String name2 = input.nextLine();
        int projects2 = input.nextInt();
        input.nextLine();
        String adminKey = input.nextLine();
        Admin a1 = new Admin(name2, projects2, adminKey);
        User[] users = {u1, d1, a1};
        int TotalClearance = 0;
        for (User user : users) {
            TotalClearance += user.getClearanceLevel();
        }
        for (User user : users) {
            if (user instanceof Admin) {
                Admin admin = (Admin) user;
                System.out.println(admin.getAdminKey());
            }
        }
        System.out.println(TotalClearance);
        input.close();
    }
}