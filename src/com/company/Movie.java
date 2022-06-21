package com.company;

import java.time.chrono.JapaneseEra;
import java.util.List;
import java.util.Scanner;

import static java.time.chrono.JapaneseEra.values;

public class Movie {
    private String movieName;
    private int date;
    private Director director;
    private String genre;
    private List<Cast> cast;

    public Movie(String movieName, int date, String genre, Director director, List<Cast> cast) {
        this.movieName = movieName;
        this.date = date;
        this.director = director;
        this.cast = cast;
        this.genre = genre;
    }

    public Movie() {}

    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    public List<Cast> getCast() {return cast;}

    public void setCast(List<Cast> cast) {this.cast = cast;}

    public String getMovieName() {return movieName;}

    public void setMovieName(String movieName) {this.movieName = movieName;}
    public int getDate() {return date;}

    public void setDate(int date) {this.date = date;}

    public Director getDirector() {
         return  director;
    }

    public void setDirector(Director director) {this.director = director;}

    public static JapaneseEra getScanner() {
        Scanner scanner = new Scanner(System.in);
        return values()[scanner.nextInt(values().length)];
    }
}
