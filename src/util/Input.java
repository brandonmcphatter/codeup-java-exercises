package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Continue? [yes/no]");
        return scanner.nextLine().toLowerCase().contains("y");
    }

    public int getInt(int min, int max) {
        int userInt = scanner.nextInt();
        if (userInt < min || userInt > max) {
            System.out.println("Read the rules and try again!");
            getInt(min, max);
        }
        return userInt;
    }

    public int getInt() {
        int userInt = scanner.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max) {
        double userDouble = scanner.nextDouble();
        if (userDouble < min || userDouble > max) {
            System.out.println("Read the rules and try again!");
            getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble() {
        double userDouble = scanner.nextDouble();
        return userDouble;
    }

}
