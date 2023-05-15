import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: " );
        int userInputInt = sc.nextInt();
        System.out.printf("Your integer is %d %n", userInputInt);

        System.out.println("Enter 3 words: ");
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.nextLine();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println("Enter a sentence: ");
        String userSentence = sc.nextLine();
        System.out.println(userSentence);

        System.out.println("Enter length of your room in ft: ");
        String roomLength = sc.nextLine();
        System.out.println("Enter width of your room in ft: ");
        String roomWidth = sc.nextLine();

        int rmLength = Integer.parseInt(roomLength);
        int rmWidth = Integer.parseInt(roomWidth);
        int perimeter = rmLength*2 + rmWidth*2;
        int area = rmLength*rmWidth;
        System.out.println("Length: " + rmLength + "ft & Width: " + rmWidth + "ft");
        System.out.println("Room Perimeter is: " + perimeter + "ft");
        System.out.println("Room Area is: " + area + "ft");
    }
}
