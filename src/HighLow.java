import java.util.Scanner;

public class HighLow {

    public static int randomNumber (){
        return (int)(Math.random()*100)+1;
    }

    public static void main(String[] args) {

        int randomNumber = randomNumber();
        int remainingGuesses = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        while (remainingGuesses > 0) {
            System.out.println("Remaining Guesses: " + remainingGuesses);
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("HIGHER");
            } else if (guess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
                break;
            }
            remainingGuesses--;
        }
        if (remainingGuesses == 0) {
            System.out.println("You ran out of guesses. The number was: " + randomNumber);
        }
        scanner.close();
    }
}


