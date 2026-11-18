package MovieManagemant;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {
    private ArrayList<Movie> movieList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Create
    public void addMovie() {
        System.out.print("Enter Movie ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Movie Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();
        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();

        Movie movie = new Movie(id, name, genre, rating);
        movieList.add(movie);
        System.out.println("Movie Added Successfully!");
    }

    // Read
    public void viewMovies() {
        if (movieList.isEmpty()) {
            System.out.println("No movies available!");
            return;
        }
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    // Update
    public void updateMovie() {
        System.out.print("Enter Movie ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Movie movie : movieList) {
            if (movie.getId() == id) {
                System.out.print("Enter New Name: ");
                movie.setName(sc.nextLine());
                System.out.print("Enter New Genre: ");
                movie.setGenre(sc.nextLine());
                System.out.print("Enter New Rating: ");
                movie.setRating(sc.nextDouble());
                System.out.println("Movie Updated Successfully!");
                return;
            }
        }
        System.out.println("Movie Not Found!");
    }

    // Delete
    public void deleteMovie() {
        System.out.print("Enter Movie ID to Delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Movie movie : movieList) {
            if (movie.getId() == id) {
                movieList.remove(movie);
                System.out.println("Movie Deleted Successfully!");
                return;
            }
        }
        System.out.println("Movie Not Found!");
    }
}