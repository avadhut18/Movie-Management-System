package MovieManagemant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieService service = new MovieService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Movie Management System ===");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Update Movie");
            System.out.println("4. Delete Movie");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: service.addMovie(); break;
                case 2: service.viewMovies(); break;
                case 3: service.updateMovie(); break;
                case 4: service.deleteMovie(); break;
                case 5: System.out.println("Thank you!"); break;
                default: System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}