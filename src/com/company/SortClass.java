package com.company;

import java.time.chrono.JapaneseEra;
import java.util.List;
import java.util.Scanner;

import static java.time.chrono.JapaneseEra.values;

public class SortClass implements Sort {

    @Override
    public void sortByYear(List<Movie> movie) {
        Sort.super.sortByYear(movie);
        ComparatorYear comparatorYear = new ComparatorYear();
        movie.sort(comparatorYear);
        for (Movie film : movie) {
            System.out.println("Year: " + film.getDate());
            System.out.println("Movie: " + film.getMovieName());
            System.out.println("Genre: " + film.getGenre());
            System.out.println("Director: " + film.getDirector());
            System.out.println("~~~~~~~~~~~~~~~ Cast ~~~~~~~~~~~~~~~");
            for (Cast casts : film.getCast()) {
                System.out.println("Actor: " + casts.getActor());
                System.out.println("Role: " + casts.getRole());
            }
            System.out.println("-------------------------------------");
        }
    }

    @Override
    public void sortByName(List<Movie> movie) {
        Sort.super.sortByName(movie);
        ComparatorName comparatorName = new ComparatorName();
        movie.sort(comparatorName);
        for (Movie film : movie) {
            System.out.println("Movie: " + film.getMovieName());
            System.out.println("Genre: " +film.getGenre());
            System.out.println("Year: " + film.getDate());
            System.out.println("Director: " + film.getDirector());
            System.out.println("~~~~~~~~~~~~~~~ Cast ~~~~~~~~~~~~~~~");
            for (Cast casts : film.getCast()) {
                System.out.println("Actor: " + casts.getActor());
                System.out.println("Role: " + casts.getRole());
            }
            System.out.println("-------------------------------------");
        }
    }

    @Override
    public void sortByDirector(List<Movie> movie) {
        Sort.super.sortByDirector(movie);
        ComparatorDirector comparatorDirector = new ComparatorDirector();
        movie.sort(comparatorDirector);
        for (Movie film : movie) {
            System.out.println("Director: " + film.getDirector().getName()+film.getDirector().getSurname());
            System.out.println("Movie: " + film.getMovieName());
            System.out.println("Genre: " + film.getGenre());
            System.out.println("Year: " + film.getDate());
            System.out.println("~~~~~~~~~~~~~~~ Cast ~~~~~~~~~~~~~~~");
            for (Cast casts : film.getCast()) {
                System.out.println("Actor: " + casts.getActor());
                System.out.println("Role: " + casts.getRole());
            }
            System.out.println("-------------------------------------");
        }
    }

    @Override
    public void sortByActorName(List<Movie> movies) {
        ComparatorActorName comparatorActorName = new ComparatorActorName();
        movies.sort(comparatorActorName);
        for (Movie movie : movies) {
            for (Movie casts : movie.getCast()) {
                System.out.println("~~~~~~~~~~~~~~~ Cast ~~~~~~~~~~~~~~~");
                System.out.println("Actor: " + casts.getCast());
                System.out.println("Role: " + casts.getCast());
            }
                System.out.println("-------------------------------------");
            }
        }

    public static JapaneseEra getScanner() {
        Scanner scanner = new Scanner(System.in);
        return values()[scanner.nextInt(values().length)];
    }

}
