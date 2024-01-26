package Opgave01.Storage;

import Opgave01.Models.Actor;
import Opgave01.Models.Movie;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
}
