package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] allMovies = MoviesArray.findAll();
        Input response = new Input();
        System.out.println("Hello User!\n");
        System.out.println("View All Movies: 1 \nView Movies By Category: 2");
        String viewMovies = response.getString();
        if (viewMovies.equals("1")){
            for (Movie movie : allMovies) {
                System.out.println(movie.getName() + " -- " + movie.getCategory() + "\n");
            }
        } else if (viewMovies.equals("2")) {
            System.out.println("Select Your Category:");
            System.out.println("Animated: 1\nDrama:    2\nHorror:   3\nSci-Fi:   4");
            int categoryChoice = response.getInt(1, 4);

        }

    }
}
