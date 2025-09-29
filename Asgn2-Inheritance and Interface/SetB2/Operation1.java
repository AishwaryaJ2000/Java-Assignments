package SetB2;

interface Operation {
    double PI = 3.142;

    double area();
    double volume();
}

class Circle implements Operation {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double volume() {
        return 0; // Circle has no volume
    }

    public void display() {
        System.out.println("Circle Area: " + area());
        System.out.println("Circle Volume: " + volume());
    }
}

class Cylinder implements Operation {
    double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    public double volume() {
        return PI * radius * radius * height;
    }

    public void display() {
        System.out.println("Cylinder Area: " + area());
        System.out.println("Cylinder Volume: " + volume());
    }
}

    class OperationTest {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();

        Cylinder cy = new Cylinder(3, 7);
        cy.display();
    }
}
