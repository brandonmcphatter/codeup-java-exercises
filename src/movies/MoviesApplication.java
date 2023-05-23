package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input response = new Input();
        System.out.println("Hello User!\n");
        System.out.println("View All Movies: 1 \nView Movies By Category: 2");
        String viewMovies = response.getString();
        if (viewMovies.equals("1")){

        } else if (viewMovies.equals("2")) {

        } else
        System.out.println("Select Your Category:");
        System.out.println("Animated\nDrama\nHorror\nSci-Fi");
    }
}
