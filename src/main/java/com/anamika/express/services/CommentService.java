package com.anamika.express.services;

import com.anamika.express.models.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getCommentsById(String id);

    void addComment(Comment comment);

}
