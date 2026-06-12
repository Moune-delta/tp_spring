package com.tp_exo1.productapi.repository;

import com.tp_exo1.productapi.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}