package com.tp_exo1.productapi.service;

import com.tp_exo1.productapi.model.Article;
import com.tp_exo1.productapi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    public List<Article> getAllArticles() {
        return repository.findAll();
    }

    public Article createArticle(Article article) {
        return repository.save(article);
    }

    public Article getArticleById(Long id) {
        return repository.findById(id).orElse(null);
    }
}