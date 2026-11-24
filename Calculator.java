
class Rectangle {
    private double length;
    private double width;

    public void setLength(double l) {
        if (l > 0) {
            length = l;
        } else {
            System.out.println("Length should be greater than 0");
        }
    }

    public void setWidth(double w) {
        if (w > 0) {
            width = w;
        } else {
            System.out.println("Width should be greater than 0");
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setWidth(5);

        System.out.println("Area of rectangle: " + r.area());
    }
}
