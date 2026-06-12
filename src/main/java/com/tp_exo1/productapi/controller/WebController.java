package com.tp_exo1.productapi.controller;

import com.tp_exo1.productapi.model.Article;
import com.tp_exo1.productapi.model.Comment;
import com.tp_exo1.productapi.model.Product;
import com.tp_exo1.productapi.service.ArticleService;
import com.tp_exo1.productapi.service.CommentService;
import com.tp_exo1.productapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("newProduct", new Product());
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(@ModelAttribute Product product) {
        productService.createProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/articles")
    public String articles(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        model.addAttribute("newArticle", new Article());
        return "articles";
    }

    @PostMapping("/articles")
    public String addArticle(@ModelAttribute Article article) {
        articleService.createArticle(article);
        return "redirect:/articles";
    }

    @GetMapping("/comments")
    public String comments(Model model) {
        model.addAttribute("comments", commentService.getAllComments());
        model.addAttribute("articles", articleService.getAllArticles());
        return "comments";
    }

    @PostMapping("/comments")
    public String addComment(@RequestParam String text,
                             @RequestParam String author,
                             @RequestParam Long articleId) {
        Article article = articleService.getArticleById(articleId);
        Comment comment = new Comment();
        comment.setText(text);
        comment.setAuthor(author);
        comment.setArticle(article);
        commentService.createComment(comment);
        return "redirect:/comments";
    }
}
