package opgave02.storage;

import opgave02.models.Actor;
import opgave02.models.Movie;
import opgave02.models.TVSerie;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static ArrayList<TVSerie> series = new ArrayList<>();
    private static ArrayList<Actor> actors = new ArrayList<>();

    public static void addMovie(Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }

    public static void addActor(Actor actor) {
        if (!actors.contains(actor)) {
            actors.add(actor);
        }
    }

    public static void addTVSerie(TVSerie serie) {
        if (!series.contains(serie)) {
            series.add(serie);
        }
    }
}
