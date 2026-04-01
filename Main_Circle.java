
class Point {

    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {

    Point center;
    double radius;

    Circle(double x, double y, double r) {
        center = new Point(x, y);
        radius = r;
    }

    void display() {
        System.out.println("Center: (" + center.x + ", " + center.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
}

public class Main_Circle {

    public static void main(String[] args) {
        Circle c = new Circle(2, 3, 4);
        c.display();
    }
}
