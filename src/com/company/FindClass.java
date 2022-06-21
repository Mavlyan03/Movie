package com.company;

import java.util.List;
import java.util.Scanner;

public  class FindClass implements Findable {
    Scanner scanner=new Scanner(System.in);

    @Override
    public void findMovieByName(List<Movie> movie) {
        System.out.println("Write movie's name: ");
        String movieName = scanner.nextLine();
       // System.out.println("----------------------------------------");
        for (Movie movies : movie) {
            if (movieName.equals(movies.getMovieName())) {
                System.out.println("Movie: " + movies.getMovieName());
                System.out.println("Genre: " + movies.getGenre());
                System.out.println("Year: " + movies.getDate());
                System.out.println("Director: " + movies.getDirector());
                System.out.println("~~~~~~~~~~~~~~~ Cast ~~~~~~~~~~~~~~~");
                for (Cast cast : movies.getCast()) {
                    System.out.println("Actor: " + cast.getActor());
                    System.out.println("Role: " + cast.getRole());
                }
                System.out.println("-------------------------------------");
            }
        }
    }
    @Override
    public void findMovieByYear(List<Movie> movie) {
        System.out.println("Write movie's year: ");
        int movieYear = scanner.nextInt();
        System.out.println("----------------------------------------");
        for (Movie movies : movie) {
            if (movieYear == movies.getDate()) {
                System.out.println("Year: " + movies.getDate());
                System.out.println("Movie: " + movies.getMovieName());
                System.out.println("Genre: " + movies.getGenre());
                System.out.println("Director: " + movies.getDirector());
                System.out.println("~~~~~~~~~~~~~~~ Cast ~~~~~~~~~~~~~~~");
                for (Cast casts : movies.getCast()) {
                    System.out.println("Actor: " + casts.getActor());
                    System.out.println("Role: " + casts.getRole());
                }
                System.out.println("-------------------------------------");
            }
        }
    }
    @Override
    public void findMovieByActor(List<Movie> movie) {
        System.out.println("Write movie's actor: ");
        String movieActor = scanner.nextLine();
        System.out.println("----------------------------------------");
        for (Movie movies : movie) {
            System.out.println("Movie name: " + movies.getMovieName());
            System.out.println("Genre: " + movies.getGenre());
            System.out.println("Director: " + movies.getDirector());
            System.out.println("Date: " + movies.getDate());
            System.out.println("~~~~~~~~~~~~~~~ Cast ~~~~~~~~~~~~~~~");
            for (Cast casts : movies.getCast()) {
                if (casts.equals(movieActor)) {
                   for (Cast cast : movies.getCast()) {
                       System.out.println("Actor: " + cast.getActor());
                       System.out.println("Role: " + cast.getRole());
                   }
                    System.out.println("-------------------------------------");
                }
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movie) {
        System.out.println("Write director's name: ");
        String directorName = scanner.nextLine();
        System.out.println("----------------------------------------");
        for (Movie movies : movie) {
            if (directorName.equals(movies.getDirector().getName())) {
                System.out.println("Director: " + movies.getDirector());
                System.out.println("Movie: " + movies.getMovieName());
                System.out.println("Genre: " + movies.getGenre());
                System.out.println("Year: " + movies.getDate());
                System.out.println("~~~~~~~~~~~~~~~ Cast ~~~~~~~~~~~~~~~");
                for (Cast casts : movies.getCast()) {
                    System.out.println("Actor: " + casts.getActor());
                    System.out.println("Role: " + casts.getRole());
                }
                System.out.println("-------------------------------------");
            }
        }
    }
}
