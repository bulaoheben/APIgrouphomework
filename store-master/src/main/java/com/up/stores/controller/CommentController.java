package com.up.stores.controller;

import com.up.stores.entity.Comment;
import com.up.stores.entity.User;
import com.up.stores.service.ICommentService;
import com.up.stores.until.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("comments")
public class CommentController extends BaseController{
    @Autowired
    private ICommentService commentService;

    @RequestMapping("insert")
<<<<<<< HEAD
    public JsonResult<Void> insertComment(Integer uid,Integer pid, String comment_){
        Comment comment = new Comment();
        comment.setUid(uid);
        comment.setPid(pid);
        comment.setComment(comment_);
        comment.setCreated_time(new Date());
        commentService.addComments(comment);
=======
    public JsonResult<Void> insertComment(Comment comment){
        commentService.insertComment(comment);
>>>>>>> 9d253a753c607c9e4fdd44d06eaf957fdd2e8262
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("display")
    public JsonResult<List<Comment>> selectByProductId(Integer pid) {
        List<Comment> data = commentService.displayComments(pid);
        return new JsonResult<List<Comment>>(OK,data);
    }

}
