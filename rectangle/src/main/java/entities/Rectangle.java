package entities;

public class Rectangle {
    public double width;
    public double height;

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getDiagonal() {
        double wh = Math.pow(width, 2) + Math.pow(height, 2);
        return Math.sqrt(wh);
    }
}
