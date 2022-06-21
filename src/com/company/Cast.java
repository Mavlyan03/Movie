package com.company;

public class Cast  extends Movie {
    private String actor;
    private String role;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Cast() {}

    public Cast(String actor, String role) {
        this.actor = actor;
        this.role = role;
    }
}