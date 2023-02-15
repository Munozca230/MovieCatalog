package Movies.model;

import javax.swing.*;
import java.util.ArrayList;

public class MovieCatalogImplementation implements IMovieCatalog{

    private final ArrayList<String> movieList;

    public MovieCatalogImplementation() {
        this.movieList = new ArrayList<>();
    }

    @Override
    public void insertMovie(Movie movieName) {
        this.movieList.add(movieName.toString());
    }


    @Override
    public void listMovies() {
        JOptionPane.showMessageDialog(
                null,
                this.movieList,
                "Movie List",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    @Override
    public void searchMovies(String movieName) {
        String result = null;
        for (var movie : this.movieList){
            if (movie.equals(movieName)) {
                result = movie;
                break;
            } else {
                result = movie;
            }
        }

        if (movieName.equals(result)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Result ->"+result,
                    "Search Movie",
                    JOptionPane.QUESTION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Movie not found ->"+movieName,
                    "Search Movie",
                    JOptionPane.WARNING_MESSAGE
            );
        }


    }
}
