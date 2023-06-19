package com.up.stores.mapper;

import com.up.stores.entity.OrderItem;

import java.util.List;

/** 处理详细订单数据的持久层接口 */
public interface OrderItemMapper {

    List<OrderItem> findByOid(int oid);
}
