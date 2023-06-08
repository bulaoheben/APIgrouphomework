package com.up.stores.service;

import com.up.stores.entity.Order;

import java.util.List;

/** 处理订单和订单数据的业务层接口 */
public interface IOrderService {
    /*创建订单*/
    Order create(Integer aid, Integer[] cids, Integer uid, String username);


    List<Order> orderlist(Integer oid, Integer uid);
}
