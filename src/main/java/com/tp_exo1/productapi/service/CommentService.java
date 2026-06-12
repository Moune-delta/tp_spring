package com.tp_exo1.productapi.service;

import com.tp_exo1.productapi.model.Comment;
import com.tp_exo1.productapi.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repository;

    public List<Comment> getAllComments() {
        return repository.findAll();
    }

    public Comment createComment(Comment comment) {
        return repository.save(comment);
    }
}