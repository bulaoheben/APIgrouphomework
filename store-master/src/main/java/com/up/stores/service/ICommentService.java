package com.up.stores.service;

import com.up.stores.entity.Comment;

import java.util.List;

public interface ICommentService {
    void insertComment(Comment comment);
    List<Comment> selectByProductId(Integer pid);
}
