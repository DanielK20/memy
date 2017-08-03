package com.example.memy.DAO;


import com.example.memy.model.gif;

import java.util.ArrayList;
import java.util.List;

public class GifDao {


    private static List<gif> gifs = new ArrayList<>();

    static {
        gifs.add(new gif("android-explosion", true,1));
        gifs.add(new gif("ben-and-mike", false,2));
        gifs.add(new gif("book-dominos", false,1));
        gifs.add(new gif("compiler-bot", true,3));
        gifs.add(new gif("cowboy-coder", false,3));
        gifs.add(new gif("infinite-andrew", false,3));

    }


    public List<gif> showAll() {
        return gifs;

    }

    public List<gif> isLike() {
        List<gif> result = new ArrayList<>();
        for (gif gif : gifs) {
            if (gif.getLike().equals(true))
                result.add(gif);
        }
        return result;
    }

    public List<gif> findOne(String name) {
        List<gif> result = new ArrayList<>();
        for (gif gif : gifs) {
            if (gif.getName().equals(name))
                result.add(gif);
        }
        return result;
    }

}




