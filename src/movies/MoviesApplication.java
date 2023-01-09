package movies;

import java.util.Scanner;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueApplication = true;
        while (continueApplication) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies by category");

            int choice = Input.getInt(0, 2);

            switch (choice) {
                case 0:
                    continueApplication = false;
                    break;
                case 1:
                    viewAllMovies();
                    break;
                case 2:
                    viewMoviesByCategory();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void viewAllMovies() {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getCategory());
        }
    }

    public static void viewMoviesByCategory() {
        System.out.print("Enter a category: ");

        // FIX THIS BELOW //

//        String category = Input.getString();

        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName());
            }
        }
    }
}
