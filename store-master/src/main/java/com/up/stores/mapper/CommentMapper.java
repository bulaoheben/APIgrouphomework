package com.up.stores.mapper;

import com.up.stores.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> selectByProductId(Integer pid);
    void insertComment(Comment comment);
}
