package Movies.model;

import java.io.Serializable;
import java.util.Objects;

public class Movie   implements Serializable {

    private String movieName;

    public Movie(){
    };

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return this.movieName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movies = (Movie) o;
        return Objects.equals(movieName, movies.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName);
    }
}
