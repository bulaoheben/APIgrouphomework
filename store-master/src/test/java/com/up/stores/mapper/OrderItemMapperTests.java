package com.up.stores.mapper;

import com.up.stores.entity.Order;
import com.up.stores.entity.OrderItem;
import com.up.stores.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


//订单详细信息查询
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderItemMapperTests {
    @Autowired
    private OrderItemMapper orderItemMapper;



    @Test
    public void findByOid() {
        List<OrderItem> result = orderItemMapper.findByOid(2);
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
