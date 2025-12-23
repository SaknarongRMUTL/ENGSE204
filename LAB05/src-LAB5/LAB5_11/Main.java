package LAB5_11;
import java.util.Scanner;
class Document {
    protected String title;
    public Document(String title) {
        this.setTitle(title);
    }
    public void displayDetails() {
        System.out.println("Document: " + title);
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
class TextDocument extends Document {
    protected int wordCount;
    public TextDocument(String title, int wordCount) {
        super(title);
        this.setWordCount(wordCount);
    }
    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + " , Words: " + wordCount);
    }
    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}
class PDFDocument extends Document {
    protected int pageCount;
    public PDFDocument(String title, int pageCount) {
        super(title);
        this.setPageCount(pageCount);
    }
    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + " , Pages: " + pageCount);
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String title1 = input.nextLine();
        int wordCount1 = input.nextInt();
        input.nextLine();
        TextDocument textdocument1 = new TextDocument(title1, wordCount1);
        String title2 = input.nextLine();
        int pageCount1 = input.nextInt();
        input.nextLine();
        PDFDocument pdfdocument1 = new PDFDocument(title2, pageCount1);
        String title3 = input.nextLine();
        int wordCount2 = input.nextInt();
        input.nextLine();
        TextDocument textdocument2 = new TextDocument(title3, wordCount2);
        String title4 = input.nextLine();
        int pageCount2 = input.nextInt();
        input.nextLine();
        PDFDocument pdfdocument2 = new PDFDocument(title4, pageCount2);
        Document[] documents = {textdocument1, pdfdocument1, textdocument2, pdfdocument2};
        int TotalPages = 0;
        for (Document document : documents) {
            if (document instanceof PDFDocument) {
                PDFDocument txtDoc = (PDFDocument) document;
                TotalPages += txtDoc.getPageCount();
            }
        }
        for (Document document : documents) {
            document.displayDetails();
        }
        System.out.println("Total Pages: " + TotalPages);
        input.close();
    }
}