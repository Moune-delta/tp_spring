package com.tp_exo1.productapi.repository;

import com.tp_exo1.productapi.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}