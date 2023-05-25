package shapes;

public class Square extends Quadrilateral {

//    private final int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getPerimeter(){
//        System.out.println("Square Perimeter:");
//        return side * 4;
//    }
//
//    public int getArea(){
//        System.out.println("Square Area:");
//        return side * side;
//    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
