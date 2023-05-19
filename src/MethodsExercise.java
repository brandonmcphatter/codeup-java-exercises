import java.util.Scanner;

public class MethodsExercise {

    public static double addition(int a, int b) {
        return a + b;
    }

    public static double subtraction(int a, int b) {
        return a - b;
    }

    public static double multiplication(int a, int b) {
        return a * b;
    }

    public static float division(int a, int b) {
        return (float) a / b;
    }

    public static double modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input < min || input > max) {
            System.out.printf("Your entry is --INVALID-- %n Enter an integer between %s and %s", min, max);
            return getInteger(min, max);
        } else {
            System.out.println(input + " is a valid number!");
        }
        return input;
    }

    public static long factorial () {
        long num = getInteger(1,10);
            long total = 1;

            for (int i = 1; i <= num; i++) {
                total *= i;
            }
        System.out.println(total);
            return total;
    }

    public static String keepGoing() {
        boolean looping = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Would you like to continue? Enter Y or N:");
            String confirm = scanner.nextLine();
            if(confirm.equalsIgnoreCase("Y")) {
                System.out.print("Enter a number between 1 and 10: ");
                factorial();
            } else {
                looping = false;
                System.out.println("Have a good day!");
            }
        } while (looping);
        return scanner.nextLine();
    }

    public static int rollDice (){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides do your dice have?");
        int sides = sc.nextInt();
        int d1 = (int)((Math.random() * sides) + 1);
        int d2 = (int)((Math.random() * sides) + 1);
        int total = d1 + d2;
        System.out.printf("First is %s and Second is %s. The total is %s.", d1, d2, total);
        System.out.println("Continue? [y/n]");
        String yesOrNo = sc.next();
        if (yesOrNo.equals("y")){
            rollDice();
        } else if (yesOrNo.equals("n")){
            System.out.println("Peace Out!");
        }
        return total;
    }

    public static void main(String[] args) {

//        #1

//        System.out.println("Addition: 2 + 3");
//        System.out.println(addition(2, 3));
//        System.out.println("Subtraction: 5 - 2");
//        System.out.println(subtraction(5, 2));
//        System.out.println("Multiplication: 3 * 3");
//        System.out.println(multiplication(3, 3));
//        System.out.println("Division: 10 / 2");
//        System.out.println(division(10, 2));
//        System.out.println("Modulus: 9 % 3");
//        System.out.println(modulus(9, 3));


//        #2

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

//        #3

//        System.out.print("Enter a number between 1 and 10: ");
//        factorial();
//        keepGoing();

//        #4

        rollDice();

    }
}
