package grades;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {

        Student brandon = new Student("Brandon", new ArrayList<>());
        System.out.println(brandon);

        brandon.addGrade(80);
        brandon.addGrade(90);
        brandon.addGrade(85);
        brandon.addGrade(100);
        System.out.println(brandon);

        System.out.println("Brandon's Grade Average is: " + brandon.getGradeAverage());

    }
}
