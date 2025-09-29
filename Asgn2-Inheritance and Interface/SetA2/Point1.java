package SetA2;

class Point {
    protected int x, y;

    public Point() {
        x = y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void display() {
        System.out.println("ColorPoint: (" + x + ", " + y + "), Color: " + color);
    }
}

class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void display() {
        System.out.println("Point3D: (" + x + ", " + y + ", " + z + ")");
    }
}

public class Point1 {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        ColorPoint cp = new ColorPoint(4, 5, "Red");
        Point3D p3d = new Point3D(1, 2, 3);

        p.display();
        cp.display();
        p3d.display();
    }
}

