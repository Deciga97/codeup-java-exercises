package shapes;

public abstract class Square extends Quadrilateral {
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
