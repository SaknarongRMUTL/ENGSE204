package LAB5_06;
import java.util.Scanner;
class Media {
    protected String title;
    public Media(String title) {
        this.settitle(title);
    }
    public void process() {
        System.out.println("Starting generic media processing");
    }
    public void settitle(String title) {
        this.title = title;
    }
}
class Video extends Media {
    protected int duration;
    public Video(String title, int duration) {
        super(title);
        this.setduration(duration);
    }
    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + duration + " minutes");
    }
    public void setduration(int duration) {
        this.duration = duration;
    }
}
class Audio extends Media {
    protected String quality;
    public Audio(String title, String quality) {
        super(title);
        this.setbitrate(quality);
    }
    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + quality + " quality");
    }
    public void setbitrate(String quality) {
        this.quality = quality;
    }
}
class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        int duration = input.nextInt();
        input.nextLine();
        Video video = new Video(title, duration);
        String title2 = input.nextLine();
        String quality = input.nextLine();
        Audio audio = new Audio(title2, quality);
        Processor.runProcessor(video);
        Processor.runProcessor(audio);
        input.close();
    }
}