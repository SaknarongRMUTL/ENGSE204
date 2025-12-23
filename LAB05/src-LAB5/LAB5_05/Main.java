package LAB5_05;
import java.util.Scanner;
class Shape {
    protected String name;
    public Shape(String name) {
        this.setname(name);
    }
    public double calculateArea() {
        return 0.0;
    }
    public void setname(String name) {
        this.name = name;
    }
}
class Circle extends Shape {
    protected double radius;
    public Circle(String name, double radius) {
        super(name);
        this.setRadius(radius);
    }
    @Override
    public double calculateArea() {
        return radius * radius * 3.14159;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
}
class Rectangle extends Shape {
    protected double width;
    protected double height;
    public Rectangle(String name, double width, double height) {
        super(name);
        this.setWidth(width);
        this.setHeight(height);
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    void setWidth(double width) {
        this.width = width;
    }
    void setHeight(double height) {
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();
        Circle circle = new Circle("", radius);
        Rectangle rectangle = new Rectangle("", width, height);
        Shape[] shapes = {circle, rectangle};
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
        input.close();
    }
}