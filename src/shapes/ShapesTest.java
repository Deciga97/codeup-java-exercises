package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter()); // prints 18
        System.out.println(myShape.getArea()); // prints 20

        myShape = new Square(5) {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(myShape.getPerimeter()); // prints 20
        System.out.println(myShape.getArea()); // prints 25
    }
}
