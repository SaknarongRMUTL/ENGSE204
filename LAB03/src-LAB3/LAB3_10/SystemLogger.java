package LAB3_10;
public class SystemLogger {
	private static int currentLogLevel = 1;
    private static String getLevelName(int level) {
        switch (level) {
            case 1: return "INFO";
            case 2: return "DEBUG";
            case 3: return "ERROR";
            default: return "UNKNOWN";
        }
    }
    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }
    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            String levelName = getLevelName(messageLevel);
            System.out.println("[" + levelName + "]: " + message);
        }
    }
}