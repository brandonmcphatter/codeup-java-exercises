package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import util.Input;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        students.put("TheCreatorOfAll", new Student("Brandon", new ArrayList<>()));
        students.get("TheCreatorOfAll").addThreeGrades(95, 80, 100);
        students.put("JavaScriptJedi", new Student("Theo", new ArrayList<>()));
        students.get("JavaScriptJedi").addThreeGrades(99, 91, 95);
        students.put("BrazilianBabeMagnet", new Student("Tim", new ArrayList<>()));
        students.get("BrazilianBabeMagnet").addThreeGrades(100, 88, 97);
        students.put("KnicksIn6", new Student("Joseph", new ArrayList<>()));
        students.get("KnicksIn6").addThreeGrades(91, 82, 90);

//        Application Start

        System.out.println("Welcome! \n\nHere are the GitHub usernames of our students:\n");
        displayUserNames(students);
        pickYourStudent(students);
    }

    public static void displayUserNames(HashMap<String, Student> hashmap) {
        Set<String> userNames = hashmap.keySet();
        StringBuilder nameList = new StringBuilder();
        for (String userName : userNames) {
            nameList.append("|").append(userName).append("| ");
        }
        System.out.println(nameList + "\n");
    }

    public static void pickYourStudent(HashMap<String, Student> hashmap){
        System.out.println("Which Student would you like to see more information on?\n");
        Input userAnswer = new Input();
        String chosenStudent = userAnswer.getString();
        if (hashmap.containsKey(chosenStudent)) {
            System.out.println("GitHub Username: " + chosenStudent);
            System.out.println(hashmap.get(chosenStudent));
            boolean proceed = userAnswer.yesNo();
            if (proceed) {
                displayUserNames(hashmap);
                pickYourStudent(hashmap);
            } else {
                System.out.println("See ya!");
            }
        } else {
            System.out.println("Sorry, no student found with the username of " + chosenStudent + "\n");
            boolean proceed = userAnswer.yesNo();
            if (proceed) {
                displayUserNames(hashmap);
                pickYourStudent(hashmap);
            } else {
                System.out.println("See ya!");
            }
        }
    }
}