package Storage;

import Models.Actor;
import Models.Movie;
import Models.TVSerie;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<>();

    public void addMovie(Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }

    public void addActor(Actor actor) {
        if (!actors.contains(actor)) {
            actors.add(actor);
        }
    }

    public void addTVSerie(TVSerie serie) {
        if (!series.contains(serie)) {
            series.add(serie);
        }
    }
}
