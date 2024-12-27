// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    abstract void draw();

    // Concrete method
    public void display() {
        System.out.println("Displaying shape");
    }
}

// Concrete class inheriting from abstract class
class Circle extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Another concrete class inheriting from abstract class
class Rectangle extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Calling the implemented methods
        circle.draw();
        circle.display();

        rectangle.draw();
        rectangle.display();
    }
}