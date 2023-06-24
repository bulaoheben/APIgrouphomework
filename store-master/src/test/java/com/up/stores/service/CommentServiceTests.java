package com.up.stores.service;

import com.up.stores.entity.Comment;
import com.up.stores.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceTests {
    @Autowired
    private ICommentService commentService;

    @Test
    public void addComment() {
        Date date = new Date();
        Comment comment = new Comment();
        comment.setUid(4);
        comment.setPid(5);
        comment.setComment("down");
        comment.setCreated_time(date);
        commentService.addComments(comment);
    }

    @Test
    public void displayComment() {
        Integer pid = 5;
        System.out.println(commentService.displayComments(pid));
    }

}
