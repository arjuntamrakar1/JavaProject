// Interface
interface DrawableShape {
    // Abstract method (does not have a body)
    void draw();

    // Default method
    default void display() {
        System.out.println("Displaying shape");
    }
}

// Concrete class implementing the interface
class MyCircle implements DrawableShape {
    // Implementing the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Another concrete class implementing the interface
class MyRectangle implements DrawableShape {
    // Implementing the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractionWithInterfaceExample {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        DrawableShape circle = new MyCircle();
        DrawableShape rectangle = new MyRectangle();

        // Calling the implemented methods
        circle.draw();
        circle.display();

        rectangle.draw();
        rectangle.display();
    }
}