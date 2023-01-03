package day25_Constructors.tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    String country, title, genre, director;
    LocalDate releaseDate;
    ArrayList<String> casts;

    public Movie(String country, String title, String genre, String director, LocalDate releaseDate, ArrayList<String> casts) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.casts = casts;
    }

    public ArrayList<String> addCast(String member){
        casts.add(member);
        return casts;
    }

    public ArrayList<String> addCasts(String[] member){
        casts.addAll(Arrays.asList(member));
        return casts;
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", casts=" + casts +
                '}';
    }
}

class TestMovie{
    public static void main(String[] args) {
        System.out.println(new Movie("USA", "Ghost", "Horror", "Hulya Zeybek", LocalDate.of(2022, 04, 18),
                new ArrayList<>(Arrays.asList("Ozzy", "Ali", "Muhtar", "Burak", "Andrew", "Marta", "Asiye"))));
    }
}

/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie

 */
