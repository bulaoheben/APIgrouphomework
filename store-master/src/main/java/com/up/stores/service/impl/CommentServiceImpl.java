package com.up.stores.service.impl;

import com.up.stores.entity.Comment;
import com.up.stores.mapper.CommentMapper;
import com.up.stores.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public void addComments(Comment comment){
        commentMapper.insertComment(comment);
    }
    @Override
    public List<Comment> displayComments(Integer pid) {
        return commentMapper.selectByProductId(pid);
    }
}
