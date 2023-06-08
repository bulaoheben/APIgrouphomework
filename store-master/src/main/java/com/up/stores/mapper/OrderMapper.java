package com.up.stores.mapper;

import com.up.stores.entity.Order;
import com.up.stores.entity.OrderItem;

import java.util.List;

/** 处理订单及订单商品数据的持久层接口 */
public interface OrderMapper {
    /* 插入订单数据*/
    Integer insertOrder(Order order);

    /*插入订单商品数据*/
    Integer insertOrderItem(OrderItem orderItem);

    List<Order> orderlist(Integer oid, Integer uid);
}
