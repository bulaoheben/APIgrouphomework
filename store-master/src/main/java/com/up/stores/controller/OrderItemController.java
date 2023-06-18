package com.up.stores.controller;

import com.up.stores.controller.BaseController;
import com.up.stores.entity.OrderItem;
import com.up.stores.service.IOrderItemService;
import com.up.stores.until.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//订单详细信息查询
@RestController
@RequestMapping("orderItem")
public class OrderItemController extends BaseController {
    @Autowired
    private IOrderItemService orderItemService;


    @RequestMapping("query")
    public JsonResult<List<OrderItem>> getByOid(Integer oid) {
        // 调用业务对象执行业务
        List<OrderItem> data = orderItemService.findByOid(oid);
        // 返回成功与数据
        return new JsonResult<List<OrderItem>>(OK, data);
    }

}

