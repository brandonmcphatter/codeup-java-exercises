import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean talkToBob = false;

        System.out.println("Would you like to talk to Bob? [y/n]");
        String userAnswer = sc.nextLine();

        if (userAnswer.equals("y")){

            talkToBob = true;

            do {
                System.out.println("Talk to Bob:");
                String userResponse = sc.nextLine();
                if (userResponse.endsWith("?")){
                    System.out.println("Sure -_-");
                } else if (userResponse.endsWith("!")) {
                    System.out.println("Whoaaa, Chill Out");
                } else if (userResponse.equals("")) {
                    System.out.println("Fine! Be that way...");
                } else {
                    System.out.println("Whatever.");
                }
            } while (talkToBob = true);
        }





    }
}
