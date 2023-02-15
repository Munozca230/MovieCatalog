package Movies.UI;

import Movies.model.IMovieCatalog;
import Movies.model.Movie;
import Movies.model.MovieCatalogImplementation;

import javax.swing.*;

public class movieUI {

    public static void userInterface() {
        IMovieCatalog movies = new MovieCatalogImplementation();
        Movie movie;

        CLOSE:
        while (true) {
            String op = JOptionPane.showInputDialog(
                    null,
                    "1 - Insert movie\n"
                    + "2 - List movie\n"
                    + "3 - Search movie\n"
                    + "4 - Exit",
                    "Choose an option",
                    3
            );
            switch (op) {
                case "1":
                    String movieName = JOptionPane.showInputDialog(
                            null,
                            "Write the name of the movie",
                            "Input",
                            3
                    );
                    movie = new Movie(movieName);
                    movies.insertMovie(movie);
                    break;
                case "2":
                    movies.listMovies();
                    break;
                case "3":
                    movieName = JOptionPane.showInputDialog(
                            null,
                            "Write the name of the movie",
                            "Input",
                            3
                    );
                    movies.searchMovies(movieName);
                    break;
                case "4":
                    break CLOSE;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "INCORRECT OPTION\n"
                            + "TRY CHOOSING A\n"
                            + "VALID OPTION\n"
                            + "BETWEEN 1-4",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE
                    );
            }
        }
    }
}
