public class ClassesAndObjects {
    // Class definition
    static class Car {
        // Fields
        String model;
        int year;

        // Constructor
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        // Method to display car details
        public void displayDetails() {
            System.out.println("Model: " + model + ", Year: " + year);
        }
    }

    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2018);

        // Accessing methods
        car1.displayDetails();
        car2.displayDetails();
    }
}