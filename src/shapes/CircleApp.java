package shapes;

import util.Input;

import java.text.DecimalFormat;

public class CircleApp {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Input circInput = new Input();
        int circValue = circInput.getInt();
        Circle firstCircle = new Circle(circValue);
        System.out.println("Radius for firstCircle is " + df.format(circValue));
        System.out.println("Circumference is " + df.format(firstCircle.getCircumference()));
        System.out.println("Area is " + df.format(firstCircle.getArea()));
        System.out.println(firstCircle.getRadius());
    }
}