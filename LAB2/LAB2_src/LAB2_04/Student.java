package LAB2_04;
public class Student {
    private String name;
    private int midtermScore;
    private int finalScore;
    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }
    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }
    public void displaySummary() {
        double avg = calculateAverage();
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + avg);
        if (avg >= 50.0) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
    }
}