import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        #1a

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        #1b

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        #1c

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i * i){
//            System.out.println(i);
//        }

//        #2

//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 & i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        #3

//        Scanner sc = new Scanner(System.in);
//        boolean confirm = true;
//        do {
//            System.out.println("Enter an integer:");
//            String userInteger = sc.nextLine();
//            int userNumber = Integer.parseInt(userInteger);
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userNumber; i++){
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-5d %n", i, squared, cubed);
//            }
//            System.out.println("Continue? [y/n]");
//            String userAnswer = sc.nextLine();
//            if (userAnswer.equals("n")){
//                confirm = false;
//                System.out.println("Thanks for your participation!");
//            }
//        } while (confirm);

//        #4

//        Scanner sc = new Scanner(System.in);
//        boolean confirm = true;
//        do {
//            System.out.println("What is your grade? (0-100):");
//            int userGrade = Integer.parseInt(sc.nextLine());
//            if (userGrade >= 88){
//                System.out.println("You got an A!");
//            } else if (userGrade >= 80) {
//                System.out.println("You got a B");
//            } else if (userGrade >= 67) {
//                System.out.println("You got a C");
//            } else if (userGrade >= 60) {
//                System.out.println("You got a D");
//            } else {
//                System.out.println("You got got an F :(");
//            }
//
//            System.out.println("Continue? [y/n]");
//            String userAnswer = sc.nextLine();
//
//            if (userAnswer.equals("n")){
//                confirm = false;
//                System.out.println("Thanks for your participation!");
//            }
//        } while (confirm);
    }
}
