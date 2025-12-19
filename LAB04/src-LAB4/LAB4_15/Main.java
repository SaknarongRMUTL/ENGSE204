package LAB4_15;
import java.util.Arrays;
import java.util.Scanner;
class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;
    public AuditRecord(String user) {
        this(user, new String[0]);
    }
    public AuditRecord(String user, String[] logs) {
        this.user = user;
        int size = Math.min(logs.length, maxMessages);
        this.logMessages = new String[size];
        int start = logs.length - size;
        System.arraycopy(logs, start, this.logMessages, 0, size);
    }
    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }
    public AuditRecord addMessage(String message) {
        if (this.logMessages.length < maxMessages) {
            String[] newLogs = Arrays.copyOf(this.logMessages, this.logMessages.length + 1);
            newLogs[newLogs.length - 1] = message;
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }
    public void displayLog() {
        System.out.println("User: " + this.user + ", Logs: " + this.logMessages.length + " " + Arrays.toString(this.logMessages));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        AuditRecord.setPolicy(max);
        String user = scanner.next();
        int n = scanner.nextInt();
        scanner.nextLine();
        AuditRecord record = new AuditRecord(user);
        for (int i = 0; i < n; i++) {
            String msg = scanner.nextLine();
            AuditRecord newRecord = record.addMessage(msg);
            if (newRecord != record) {
                System.out.println(msg + " added.");
                record = newRecord;
            }
        }
        record.displayLog();
        
        scanner.close();
    }
}