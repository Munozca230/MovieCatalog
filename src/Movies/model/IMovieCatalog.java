package Movies.model;

public interface IMovieCatalog {
    void insertMovie(Movie movieName);
    void listMovies();
    void searchMovies(String movieName);
}
