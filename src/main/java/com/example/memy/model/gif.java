package com.example.memy.model;

public class gif {
    private String name;
    private Boolean isLike;
    private int catId;

    public gif() {

    }

    public gif(String name, Boolean isLike, int catId) {
        this.name = name;
        this.isLike = isLike;
        this.catId = catId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
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
