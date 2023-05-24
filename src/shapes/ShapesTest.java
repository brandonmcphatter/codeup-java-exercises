package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Box 1 Area is: " + box1.getArea());
        System.out.println("Box 1 Perimeter is: " + box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("Box 2 Area is: " + box2.getArea());
        System.out.println("Box 2 Perimeter is: " + box2.getPerimeter());
    }
}
