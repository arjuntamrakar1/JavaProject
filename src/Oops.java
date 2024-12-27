// File: /c:/Users/atamrakar/OneDrive - Avaya/Desktop/JavaProject/src/OopsConcept/Main.java

// Class definition
class Animal {
    // Encapsulation: private fields
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to demonstrate polymorphism
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Inheritance: Dog class inherits from Animal class
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overriding the makeSound method to demonstrate polymorphism
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Abstraction: Abstract class with abstract method
abstract class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    // Abstract method
    public abstract void fly();
}

// Concrete class extending abstract class
class Sparrow extends Bird {
    public Sparrow(String name, int age) {
        super(name, age);
    }

    // Implementing abstract method
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    // Overriding the makeSound method to demonstrate polymorphism
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}

public class Oops {
    public static void main(String[] args) {
        // Creating objects (instances of classes)
        Animal genericAnimal = new Animal("Generic", 5);
        Dog dog = new Dog("Buddy", 3);
        Sparrow sparrow = new Sparrow("Jack", 1);

        // Demonstrating encapsulation
        System.out.println("Animal Name: " + genericAnimal.getName());
        genericAnimal.setName("New Generic");
        System.out.println("Updated Animal Name: " + genericAnimal.getName());

        // Demonstrating polymorphism
        genericAnimal.makeSound(); // Outputs: Some generic animal sound
        dog.makeSound();           // Outputs: Bark
        sparrow.makeSound();       // Outputs: Chirp

        // Demonstrating abstraction
        sparrow.fly();             // Outputs: Sparrow is flying
    }
}