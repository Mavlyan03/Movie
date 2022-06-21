package com.company;

import java.util.List;

public interface Findable {

    default void findMovieByDirector(List<Movie> movie) {}

    default void findMovieByYear(List<Movie> movie) {}

    default void findMovieByName(List<Movie> movie) {}

    default void findMovieByActor(List<Movie> movie) {}

}
