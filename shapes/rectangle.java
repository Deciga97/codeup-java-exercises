public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    public class Square extends Rectangle {
        public Square(double side) {
            super(side, side);
        }
    }

    public class ShapesTest {
        public static void main(String[] args) {
            Rectangle box1 = new Rectangle(4, 5);
            System.out.println(box1.getPerimeter()); // prints 18
            System.out.println(box1.getArea()); // prints 20

            Rectangle box2 = new Square(5);
            System.out.println(box2.getPerimeter()); // prints 20
            System.out.println(box2.getArea()); // prints 25
        }
    }


}
