package com.example.memy.DAO;


import com.example.memy.model.category;


import java.util.ArrayList;
import java.util.List;

public class CategoryDao {

    private static List<category> categories = new ArrayList<>();

    static {
        categories.add(new category("Top Rated", 1));
        categories.add(new category("Newest", 2));
        categories.add(new category("Animals", 3));
    }

    public List<category> showAllCategory() {
        return categories;
    }
}
