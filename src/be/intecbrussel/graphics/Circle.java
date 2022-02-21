package be.intecbrussel.graphics;

public class Circle {

    public final static int ANGLES = 0;
    private static int count;
    private int radius;
    private int x;
    private int y;

    public Circle() {
        this(0);
    }

    public Circle(int radius) {
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {
        setRadius(radius);
        setPosition(x, y);
        count++;
    }

    public Circle(Circle c) {
        this(c.getRadius(), c.getX(), c.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getCount() {
        return count;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public void grow(int z) {
        this.radius = radius + z;
    }
}
