package com.example.memy.DAO;


import com.example.memy.model.category;


import java.util.ArrayList;
import java.util.List;

public class  CategoryDao {

    private static List<category> categories = new ArrayList<>();

    static {
        categories.add(new category("Top Rated", 1L));
        categories.add(new category("Newest", 2L));
        categories.add(new category("Animals", 3L));
    }

    public List<category> showAllCategory() {
        return categories;
    }

    public category showJsonForCategory(Long id) {
        if (id == 1L) {
            return categories.get(0);
        }
        else if (id == 2L){
            return categories.get(1);
        } else if(id == 3L)
            return categories.get(2);
        return null;
    }
}