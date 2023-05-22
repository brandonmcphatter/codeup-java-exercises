package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {

        Input circInput = new Input();
        int circValue = circInput.getInt();
        Circle firstCircle = new Circle(circValue);
        System.out.println("Radius for firstCircle is " + circValue);
        System.out.println("Circumference is " + firstCircle.getCircumference());
        System.out.println("Area is " + firstCircle.getArea());
        System.out.println(firstCircle.getRadius());
    }
}
