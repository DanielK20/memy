package com.example.memy.controller;

import com.example.memy.DAO.CategoryDao;
import com.example.memy.model.category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryApiController {


    @GetMapping("api/categories/{id}")
    public List<category> listCategories(@RequestParam int id){
        CategoryDao categoryDao = new CategoryDao();
        return categoryDao.showAllCategory();
    }
}
