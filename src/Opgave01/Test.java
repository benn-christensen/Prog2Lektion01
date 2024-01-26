package Opgave01;

import Opgave01.Models.Actor;
import Opgave01.Models.Director;
import Opgave01.Models.Genre;
import Opgave01.Models.Movie;
import Opgave01.Storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Storage storage = initStorage();
    }

    private static Storage initStorage() {
        Storage storage = new Storage();
        Director georgeLukas = new Director("George Walton Lucas Jr.", LocalDate.of(1944, 5, 14));
        Director spielberg = new Director("Steven Spielberg", LocalDate.of(1946, 12, 18));
        Actor ford = new Actor("Harrison Ford", LocalDate.of(1942, 7, 13));
        Actor hamill = new Actor("Mark Hamill", LocalDate.of(1951, 9, 25));
        Actor fisher = new Actor("Carrie Fisher", LocalDate.of(1965, 10, 21));
        Actor allan = new Actor("Karen Allen", LocalDate.of(1951, 10, 5));
        Movie starWars = new Movie("Star Wars", 1977, georgeLukas,
                new Genre[]{Genre.ACTION, Genre.FANTACY, Genre.ADVENTURE}, 8.6,
                new ArrayList<>(Arrays.asList(ford, hamill, fisher)));

        Movie indy = new Movie("Raiders of the Lost Ark", 1981, spielberg,
                new Genre[]{Genre.ACTION, Genre.ADVENTURE}, 8.4,
                new ArrayList<>(Arrays.asList(ford, allan)));
        storage.addMovie(starWars);
        storage.addMovie(indy);
        return storage;
    }
}
