package LAB3_05;
public class DatabaseConnection {
	private String connectionString;
    private boolean connected;
    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void connect() {
        if (this.connected == false) {
            this.connected = true;
            System.out.println("Connected to " + this.connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }
    public void disconnect() {
        if (this.connected == true) {
            this.connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}