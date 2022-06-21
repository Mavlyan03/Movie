package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Director director1 = new Director("Steven ", "Spielberg");
        ArrayList<Cast> cast1 = new ArrayList<>();
        cast1.add(new Cast("Leonardo Dicaprio", "Frank Abegnale"));
        cast1.add(new Cast("Tom Hanks", "Karl Hanretty"));

        Director director2 = new Director("Christopher ", "Nolan");
        ArrayList<Cast> cast2 = new ArrayList<>();
        cast2.add(new Cast("Matthew  McConaughey", "Cooper"));
        cast2.add(new Cast("Anne Hathaway", "Amelia Brand"));

        Director director3 = new Director("Matt ", "Rives");
        ArrayList<Cast> cast3 = new ArrayList<>();
        cast3.add(new Cast("Robert Pattinson", "Bruce Wayne"));
        cast3.add(new Cast("Zoe Kravits", "Cat-Woman"));

        Director director4 = new Director("John ", "Watts");
        ArrayList<Cast> cast4 = new ArrayList<>();
        cast4.add(new Cast("Tom Holland", "Peter Parker"));
        cast4.add(new Cast("Zendaya", "MJ"));

        Director director5 = new Director("Deni ", "Vilnev");
        ArrayList<Cast> cast5 = new ArrayList<>();
        cast5.add(new Cast("Timothee Chalamet", "Paul Atreides"));
        cast5.add(new Cast("Rebecca Ferguson", "Lady Jessica"));

        List<Movie> movie = new ArrayList<>();
        movie.add(new Movie("Catch me if you can", 2002, "detective", director1, cast1));
        movie.add(new Movie("Interstellar", 2014, "science-fantastic", director2, cast2));
        movie.add(new Movie("Batman", 2022, "detective & action", director3, cast3));
        movie.add(new Movie("Spider-Man: No Way Home", 2021, "fantastic", director4, cast4));
        movie.add(new Movie("Dune: Part I", 2020, "action", director5, cast5));

        Scanner scanner = new Scanner(System.in);
        Findable findable = new FindClass();
        Sort sortable = new SortClass();
        System.out.println("Find ");
        System.out.println("Sort ");
        int number1 = scanner.nextInt();
        if (number1 == 1) {
            System.out.println("Please enter number for find movie: ");
            System.out.println(1 + " - Find movie by movie name");
            System.out.println(2 + " - Find movie by year");
            System.out.println(3 + " - Find movie by actor name");
            System.out.println(4 + " - Find movie by director name");
            int num1 = scanner.nextInt();
            switch (num1) {
                case 1 -> findable.findMovieByName(movie);
                case 2 -> findable.findMovieByYear(movie);
                case 3 -> findable.findMovieByActor(movie);
                case 4 -> findable.findMovieByDirector(movie);
                default -> System.out.println("You write wrong number");
            }
        }
        else if (number1 == 2){
            System.out.println("Please enter number for sort movie: ");
            System.out.println("1 - Sort by name of movie");
            System.out.println("2 - Sort by year of movie");
            System.out.println("3 - Sort by film director name");
            System.out.println("4 - Sort by actor name of movie");
            int num2 = scanner.nextInt();
            switch (num2) {
                case 1 -> sortable.sortByName(movie);
                case 2 -> sortable.sortByYear(movie);
                case 3 -> sortable.sortByDirector(movie);
                case 4 -> sortable.sortByActorName(movie);
                default -> System.out.println("We don't have other sort methods!");
            }
        }
        else {
            System.out.println("You enter wrong number");
        }


    }

}
