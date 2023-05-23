import java.util.Arrays;
public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] copy = Arrays.copyOf(array, array.length + 1 );
        copy[copy.length - 1] = newPerson;
        return copy;
    }

    public static void main(String[] args) {

//        #1

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Brandon");
        people[1] = new Person("Joseph");
        people[2] = new Person("Theo");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        System.out.println("---updated names---");
        Person[] morePpl = addPerson(people, new Person("Tim"));
        for (Person person : morePpl) {
            System.out.println(person.getName());
        }
    }
}
