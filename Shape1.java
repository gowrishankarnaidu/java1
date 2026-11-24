
class Shape {
    String color;

    void displayColor() {
        System.out.println("The color of the shape is: " + color);
    }
}
class Circle extends Shape {
    double radius;
    void area() {
        System.out.println("The area of the circle is: " + (3.14 * radius * radius));
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    void area() {
        System.out.println("The area of the rectangle is: " + (length * width));
    }
}
public class Shape1 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.color = "Red";
        c.radius = 5;
        c.displayColor();
        c.area();
        Rectangle r = new Rectangle();
        r.color = "Blue";
        r.length = 4;
        r.width = 6;
        r.displayColor();
        r.area();
    }
}
