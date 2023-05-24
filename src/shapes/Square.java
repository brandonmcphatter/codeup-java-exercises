package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getPerimeter(){
        return this.side * 4;
    }

    public int getArea(){
        return this.side * this.side;
    }


}
