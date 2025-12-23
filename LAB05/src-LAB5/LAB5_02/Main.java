package LAB5_02;
import java.util.Scanner;
class Animal {
    protected String name;
    protected int age;
    public void maskSound() {
        System.out.println("I am an animal");
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Cat extends Animal {
    @Override
    public void maskSound() {
        System.out.println("Meow!");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        input.nextLine();
        Cat cat = new Cat();
        cat.name = name;
        cat.age = age;
        cat.displayInfo();
        cat.maskSound();
        input.close();
    }    
}
