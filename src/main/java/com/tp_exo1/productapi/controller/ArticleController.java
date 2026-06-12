package com.tp_exo1.productapi.controller;

import com.tp_exo1.productapi.model.Article;
import com.tp_exo1.productapi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping
    public List<Article> getAll() {
        return service.getAllArticles();
    }

    @PostMapping
    public Article create(@RequestBody Article article) {
        return service.createArticle(article);
    }
}