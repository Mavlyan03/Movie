package com.company;

import java.util.Comparator;

public class ComparatorYear implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
      return o1.getDate() - o2.getDate();
    }
}
