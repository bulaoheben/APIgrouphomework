package com.up.stores.service;

import com.up.stores.entity.OrderItem;
import com.up.stores.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//订单详细信息查询
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderItemServiceTests {
    @Autowired
    private IOrderItemService orderItemService;
    @Test
    public void findByOid() {
        try {
            Integer oid = 2;
            List<OrderItem> list = orderItemService.findByOid(oid);
            System.out.println(list);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
