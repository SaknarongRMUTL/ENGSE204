package LAB3_15;
public class User {
	private String username;
    private int failedAttempts;       
    private boolean isLocked; 
    private static int maxAttempts = 3; 
    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }
    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }
    public String getUsername() { return username; }
    public boolean isLocked() { return isLocked; }
    public int getFailedAttempts() { return failedAttempts; }
    public void login(String password) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }
        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
        } 
        else {
            failedAttempts++;
            if (failedAttempts >= maxAttempts) {
                isLocked = true; 
                System.out.println("Login failed. Account locked.");
            } else {
                int left = maxAttempts - failedAttempts;
                System.out.println("Login failed. " + left + " attempts left.");
            }
        }
    }
}