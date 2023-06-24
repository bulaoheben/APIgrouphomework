package com.up.stores.mapper;
import com.up.stores.entity.Comment;
import com.up.stores.entity.User;
import org.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentMapperTests {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void insertComment(){
        Date date = new Date();
        Comment comment = new Comment();
        comment.setUid(1);
        comment.setPid(5);
        comment.setComment("this is a good item");
        comment.setCreated_time(date);
        commentMapper.insertComment(comment);
    }

    @Test
    public void selectByProductId() {
        Integer pid = 9;
        System.out.println(commentMapper.selectByProductId(pid));
    }
}
