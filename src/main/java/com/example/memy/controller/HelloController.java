package com.example.memy.controller;


import com.example.memy.DAO.CategoryDao;
import com.example.memy.DAO.GifDao;
import com.example.memy.model.gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {



    GifDao gifDao = new GifDao();
    CategoryDao categoryDao = new CategoryDao();

    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDao.showAll() );
        return "home";
    }

    @GetMapping("/gifs/search")
    public String search(@RequestParam String q, ModelMap modelMap){
    modelMap.addAttribute("gifs",gifDao.findByName(q));
        return "home";
    }


    @GetMapping("/categories")
    public String hello3( ModelMap modelMap){
        modelMap.addAttribute("categories", categoryDao.showAllCategory() );
        return "categories";
    }

    @GetMapping("/articles")
    public String articles(){
        return "articles";
    }
    @GetMapping("/favorites")
    public String favorites( ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDao.isLike() );
        return "isLike";
    }
    @GetMapping("/gif/{name}")
    public String displayMem(@PathVariable String name, ModelMap modelMap) {
        System.out.println(name);
        modelMap.addAttribute("gifs", gifDao.findOne(name));
        return "displayOne";
    }

}
