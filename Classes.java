🔹 Basic Structure of a Java Class
java
Copy
Edit
public class Car {
    // Fields (aka attributes or properties)
    String color;
    int year;

    // Constructor
    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    // Method
    public void drive() {
        System.out.println("The " + color + " car from " + year + " is driving.");
    }
}
🔸 Creating Objects from a Class
java
Copy
Edit
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", 2020);
        myCar.drive(); // Output: The Red car from 2020 is driving.
    }
}
🧱 Components of a Class

Component	Description
Fields	Variables that hold the state of an object
Methods	Functions that define behaviors of the object
Constructor	Special method used to initialize objects
Modifiers	Keywords like public, private, static, final
Inner Classes	Classes defined within another class
🔐 Access Modifiers
public: Accessible from anywhere

private: Accessible only within the class

protected: Accessible within the package and subclasses

default (no modifier): Accessible within the package

🧠 Notes
A file can have one public class, and it must match the filename.

Java supports inheritance, so one class can extend another.

Classes can implement interfaces to guarantee certain methods.

