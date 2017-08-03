package com.example.memy.model;

public class gif {
    private String name;
    private Boolean isLike;
    private int catId;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public gif() {

    }

    public gif(String name, Boolean isLike, int catId, String username) {
        this.name = name;
        this.isLike = isLike;
        this.catId = catId;
        this.username = username;
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
