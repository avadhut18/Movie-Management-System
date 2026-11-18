package MovieManagemant;
public class Movie {
    private int id;
    private String name;
    private String genre;
    private double rating;

    public Movie(int id, String name, String genre, double rating) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Genre: " + genre + ", Rating: " + rating;
    }
}