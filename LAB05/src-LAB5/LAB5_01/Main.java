package LAB5_01;
import java.util.Scanner;
class Animal {
    protected String name;
    protected int age;
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Dog extends Animal {
    public void maskSound() {
        System.out.println("Woof! Woof!");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        input.nextLine();
        Dog dog = new Dog();
        dog.name = name;
        dog.age = age;
        dog.maskSound();
        dog.displayInfo();
        input.close();
    }    
}