public class ServerNameGenerator {

    public static String[] adjectives = {"Jealous", "Fancy", "Clean", "Eager", "Mysterious", "Kind", "Worried", "Gorgeous", "Plump", "Polite"};

    public static String[] nouns = {"Stranger", "Beer", "Height", "Woman", "Boat", "Lake", "Building", "Computer", "Office", "Turkey"};

    public static String returnRandom(String[] array) {
        return array[(int) (Math.random() * 9)];
    }

    public static void main(String[] args) {
        String one = returnRandom(adjectives);
        String two = returnRandom(nouns);
        System.out.printf("Server: \n%s-%s", one, two);
    }
}
