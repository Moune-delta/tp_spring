package com.tp_exo1.productapi.controller;

import com.tp_exo1.productapi.model.Comment;
import com.tp_exo1.productapi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService service;

    @PostMapping
    public Comment create(@RequestBody Comment comment) {
        return service.createComment(comment);
    }
}