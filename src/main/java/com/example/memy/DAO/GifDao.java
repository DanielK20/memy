package com.example.memy.DAO;


import com.example.memy.model.gif;

import java.util.ArrayList;
import java.util.List;

public class GifDao {


    private static List<gif> gifs =new ArrayList<>();

    static {
        gifs.add(new gif("android-explosion"));
        gifs.add(new gif("ben-and-mike"));
        gifs.add(new gif("book-dominos"));
        gifs.add(new gif("compiler-bot"));
        gifs.add(new gif("cowboy-coder"));
        gifs.add(new gif("infinite-andrew"));

    }


    public List<gif> showAll() {
        return gifs;

    }
}


