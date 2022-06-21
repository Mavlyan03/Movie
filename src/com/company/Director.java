package com.company;

public class Director extends Movie {
    private String directorName;
    private String directorSurname;

    public String getName() {return directorName;}

    public void setName(String name) {this.directorName = name;}

    public String getSurname() {return directorSurname;}

    public void setSurname(String surname) {this.directorSurname = surname;}

    public Director() {};

    public Director(String directorName, String directorSurname) {
        this.directorName = directorName;
        this.directorSurname = directorSurname;
    }

}
