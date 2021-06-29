package com.anamika.express.controllers;

import com.anamika.express.models.Comment;
import com.anamika.express.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController
{
    private CommentService commentService;

    @Autowired
    CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/{id}")
    public List<Comment> getCommentsById(@PathVariable("id") String id)
    {
        return commentService.getCommentsById(id);
    }


    @PostMapping("/")
    public void addCommentsById(@RequestBody Comment comment)
    {
        commentService.addComment(comment);
    }
}