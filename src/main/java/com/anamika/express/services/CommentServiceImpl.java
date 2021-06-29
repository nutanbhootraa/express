package com.anamika.express.services;

import com.anamika.express.models.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CommentServiceImpl implements CommentService {


    List<Comment> comments = new ArrayList<>(Arrays.asList(new Comment("1", "Nutan", "Nice"),
            new Comment("1", "Kartik", "Nice1")));


    public List<Comment> getCommentsById(String id) {



        return comments.stream().filter(comment -> id.equals(comment.getId()))
                .collect(Collectors.toList());

    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
