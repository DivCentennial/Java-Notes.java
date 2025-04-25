

What is @Override in Java?
@Override is an annotation that tells the Java compiler:

“Hey, I’m overriding a method from a superclass or interface.”

If you mess up — say, by spelling the method name wrong or using the wrong parameter — the compiler throws an error. This helps catch bugs early.

✅ Example: Method Overriding with @Override
java
Copy
Edit
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
When you run:

java
Copy
Edit
Animal a = new Dog();
a.sound();
Output:

nginx
Copy
Edit
Dog barks
Here, Dog overrides the sound() method from Animal, and the @Override annotation ensures you did it correctly.

❌ What if you mess up?
java
Copy
Edit
class Dog extends Animal {
    @Override
    void Sound() {  // wrong case
        System.out.println("Dog barks");
    }
}
This will give a compile-time error like:

css
Copy
Edit
method does not override or implement a method from a supertype
Without @Override, the compiler wouldn’t catch it, and your method just wouldn't override anything — which could cause really sneaky bugs.

🔸 Also Used with Interfaces
java
Copy
Edit
interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}
Works exactly the same — ensures you're correctly implementing the interface method.

🧠 TL;DR

Feature	Description
Purpose	Tells compiler you're overriding a method
Checks	Ensures method name, return type, and parameters match exactly
Benefit	Catches errors at compile-time, safer and cleaner code
Use with	Superclass methods, abstract classes, and interface methods