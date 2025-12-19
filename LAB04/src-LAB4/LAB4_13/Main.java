package LAB4_13;
import java.util.Scanner;
class Subscription {
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;
    public Subscription(String planName, int durationDays) {
        this.planName = planName;
        int tempDays = durationDays;
        if (tempDays > maxDuration) {
            tempDays = maxDuration;
        } else if (tempDays < 0) {
            tempDays = 0;
        }
        this.durationDays = tempDays;
    }
    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }
    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
        } else {
            System.out.println("Invalid max policy.");
        }
    }
    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }
        int newDays = this.durationDays + days;
        if (newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }
        return new Subscription(this.planName, newDays);
    }
    public void displayInfo() {
        System.out.println("Plan: " + this.planName + ", Days: " + this.durationDays);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxInput = scanner.nextInt();
        Subscription.setMaxDuration(maxInput);
        if (maxInput > 0) {
             System.out.println("Max duration set to " + maxInput);
        }
        String planName = scanner.next();
        int initDays = scanner.nextInt();
        Subscription sub = new Subscription(planName, initDays);
        int extDays1 = scanner.nextInt();
        Subscription temp1 = sub.extend(extDays1);
        if (temp1 != sub) {
            sub = temp1;
            System.out.println("Extension successful.");
        }
        int extDays2 = scanner.nextInt();
        Subscription temp2 = sub.extend(extDays2);
        if (temp2 != sub) {
            sub = temp2;
            System.out.println("Extension successful.");
        }
        sub.displayInfo();
        scanner.close();
    }
}