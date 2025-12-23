package LAB5_10;
import java.util.Scanner;
class ProjectTask {
    protected String description;
    protected int baseHours;
    public ProjectTask(String description, int baseHours) {
        this.setDescription(description);
        this.setBaseHours(baseHours);
    }
    public double calculateCost() {
        return baseHours * 50.0;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setBaseHours(int baseHours) {
        this.baseHours = baseHours;
    }
}
class ComplexTask extends ProjectTask {
    protected double setupFee;
    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setSetupFee(setupFee);
    }
    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
    public void setSetupFee(double setupFee) {
        this.setupFee = setupFee;
    }
}
class SimpleTask extends ProjectTask {
    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }
    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String description1 = input.nextLine();
        int baseHours1 = input.nextInt();
        double setupFee = input.nextDouble();
        input.nextLine();
        ComplexTask complexTask = new ComplexTask(description1, baseHours1, setupFee);
        String description2 = input.nextLine();
        int baseHours2 = input.nextInt();
        input.nextLine();
        SimpleTask simpleTask = new SimpleTask(description2, baseHours2);
        ProjectTask[] tasks = {complexTask, simpleTask};
        for (ProjectTask task : tasks) {
            System.out.println(task.calculateCost());
        }
        input.close();
    }
}