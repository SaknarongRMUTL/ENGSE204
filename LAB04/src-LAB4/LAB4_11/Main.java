package LAB4_11;
import java.util.Scanner;
class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;
    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;
        this.darkMode = darkMode;
        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }
    }
    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }
    public void displaySettings() {
        System.out.println("Theme: " + this.theme + ", Size: " + this.fontSize + ", Dark: " + this.darkMode);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String baseTheme = scanner.next();
        int baseFontSize = scanner.nextInt();
        boolean baseDarkMode = scanner.nextBoolean();
        Configuration baseConfig = new Configuration(baseTheme, baseFontSize, baseDarkMode);
        String userTheme = scanner.next();
        int userFontSize = scanner.nextInt();
        boolean userDarkMode = scanner.nextBoolean();
        Configuration userConfig = new Configuration(userTheme, userFontSize, userDarkMode);
        Configuration finalConfig = new Configuration(baseConfig, userConfig);
        finalConfig.displaySettings();
        scanner.close();
    }
}