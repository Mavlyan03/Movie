package com.company;

import java.util.List;

public interface Sort {

    default void sortByYear(List<Movie> movie) {}

    default void sortByName(List<Movie> movie) {}

    default void sortByDirector(List<Movie> movie) {}

    default void sortByActorName(List<Movie> cast) {};


}
