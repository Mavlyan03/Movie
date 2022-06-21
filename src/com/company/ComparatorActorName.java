package com.company;

import java.util.Comparator;

public class ComparatorActorName implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        for (Cast cast1 : o1.getCast()) {
            for (Cast cast2 : o2.getCast()) {
                return cast1.getActor().compareTo(cast2.getActor());
            }
        }
        return 0;

    }
}
