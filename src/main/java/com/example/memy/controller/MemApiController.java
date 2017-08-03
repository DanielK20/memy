package com.example.memy.controller;

import com.example.memy.DAO.CategoryDao;
import com.example.memy.model.category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemApiController {


        @GetMapping("/api/categories")
        public List<category> listCategories(){
            CategoryDao categoryDao = new CategoryDao();
            return categoryDao.showAllCategory();
        }
    }



