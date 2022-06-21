package com.company;

import java.util.Comparator;

public class ComparatorDirector implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getDirector().getName().compareTo(o2.getDirector().getName());
    }

}
