package com.example.memy.controller;

import com.example.memy.DAO.CategoryDao;
import com.example.memy.model.category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryApiController {


    @GetMapping("api/categories/{id}")
    public category listCategories(@PathVariable Long id){
        CategoryDao categoryDao = new CategoryDao();
        return categoryDao.showJsonForCategory(id);
    }
}
