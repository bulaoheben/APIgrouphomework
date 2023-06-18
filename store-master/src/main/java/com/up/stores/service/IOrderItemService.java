package com.up.stores.service;

import com.up.stores.entity.OrderItem;

import java.util.List;

/** 处理详细订单数据的业务层接口 */
public interface IOrderItemService {

    List<OrderItem> findByOid(Integer oid);

}