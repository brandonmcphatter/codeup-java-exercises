package util;

public class InputTest {

    public static void main(String[] args) {

    Input test = new Input();

    System.out.println("Enter a string:");
    test.getString();

    test.yesNo();

    test.getInt(1, 10);

    test.getInt();

    test.getDouble(1, 10);

    test.getDouble();

    System.out.println("This concludes the test. Thank you!");

    }
}
