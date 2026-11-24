
class Vehicle {
    void honk() {
        System.out.println("beep beep");
    }

    void displayDetails() {
        System.out.println("BMW");
    }
}
class Car extends Vehicle {
}
public class Main1 {
    public static void main(String[] args) {
        Car c = new Car();

        c.honk();
        c.displayDetails();
    }
}
