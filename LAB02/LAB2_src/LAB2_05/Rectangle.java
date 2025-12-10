package LAB2_05;
public class Rectangle {
    private double width;
    private double height;
    private int Perimeter = 2;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return Perimeter * (width + height);
    }
}