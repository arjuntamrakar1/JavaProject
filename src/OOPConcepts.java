// Base class
class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Another derived class
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class OOPConcepts {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        // Accessing methods
        System.out.println(dog.getName() + " says: ");
        dog.makeSound();

        System.out.println(cat.getName() + " says: ");
        cat.makeSound();
    }
}