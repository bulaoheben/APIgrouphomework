package com.up.stores.controller;

import com.up.stores.entity.Order;
import com.up.stores.service.IOrderService;
import com.up.stores.until.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController extends BaseController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("create")
    public JsonResult<Order> create(Integer aid, Integer[] cids, HttpSession session) {
        // 从Session中取出uid和username
        Integer uid = getuidFromSession(session);
        String username = getUsernameFromSession(session);
        // 调用业务对象执行业务
        Order data = orderService.create(aid, cids, uid, username);
        // 返回成功与数据
        return new JsonResult<Order>(OK, data);
    }

    @RequestMapping("orderlist")
    public JsonResult<List<Order>> orderlist(Integer oid, HttpSession session) {
        // 从Session中取出uid和username
        Integer uid = getuidFromSession(session);
        // 调用业务对象执行业务
        List<Order> data = orderService.orderlist(oid, uid);
        // 返回成功与数据
        return new JsonResult<List<Order>>(OK, data);
    }

}

