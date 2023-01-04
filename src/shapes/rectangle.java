public interface Measurable {
    double getPerimeter();
    double getArea();
}

public abstract class Shape {
}

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}


public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}


public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter()); // prints 18
        System.out.println(myShape.getArea()); // prints 20

        myShape = new Square(5);
        System.out.println(myShape.getPerimeter()); // prints 20
        System.out.println(myShape.getArea()); // prints 25
    }
}
