package com.up.stores.entity;
import java.io.Serializable;
import java.time.DateTimeException;
import java.util.Date;
import java.util.List;

public class Comment extends BaseEntity implements Serializable {
    private Integer cid;
    private Integer uid;
    private Integer pid;
    private String comment;
    private Date created_time;

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", comment='" + comment + '\'' +
                ", created_time=" + created_time +
                '}';
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCid() {
        return cid;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getPid() {
        return pid;
    }

    public String getComment() {
        return comment;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }
}
