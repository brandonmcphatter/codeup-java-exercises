package grades;
import java.util.ArrayList;



public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void addThreeGrades(int grade1, int grade2, int grade3) {
        grades.add(grade1);
        grades.add(grade2);
        grades.add(grade3);
    }

    public double getGradeAverage() {
        double gradeSum = 0;
        for (Integer grade : grades) {
            gradeSum += grade;
        }
        return gradeSum / grades.size();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Grade Avg: " + getGradeAverage();

    }
}
