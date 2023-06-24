package com.up.stores.service;

import com.up.stores.entity.Comment;

import java.util.List;

public interface ICommentService {
    void addComments(Comment comment);
    List<Comment> displayComments(Integer pid);
}
