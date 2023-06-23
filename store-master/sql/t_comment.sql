DROP TABLE IF EXISTS t_comment;

CREATE TABLE t_comment (
  cid int(20) NOT NULL AUTO_INCREMENT COMMENT '评价id',
  uid int(20) NOT NULL COMMENT '用户id',
  pid int(20) NOT NULL COMMENT '商品id',
  comment varchar(255) NOT NULL COMMENT '评价内容',
  created_time datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (cid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;