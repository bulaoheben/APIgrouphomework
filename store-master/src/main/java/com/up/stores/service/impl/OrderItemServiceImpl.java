package com.up.stores.service.impl;


import com.up.stores.entity.OrderItem;

import com.up.stores.mapper.OrderItemMapper;
import com.up.stores.service.IOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** 处理订单和订单数据的业务层实现类 */
@Service
public class OrderItemServiceImpl implements IOrderItemService {
    @Autowired
    private OrderItemMapper orderItemMapper;


    @Override
    public List<OrderItem> findByOid(Integer oid) {
        List<OrderItem> orderItems = orderItemMapper.findByOid(oid);
        return orderItems;
    }


}
