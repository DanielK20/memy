package com.example.memy.model;

public class gif {
    private String name;
    private Boolean isLike;

    public gif() {

    }

    public gif(String name, Boolean isLike) {
        this.name = name;
        this.isLike = isLike;
    }

    public Boolean getLike() {
        return isLike;
    }

    public void setLike(Boolean like) {
        isLike = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
