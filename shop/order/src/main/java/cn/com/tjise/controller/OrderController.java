package cn.com.tjise.controller;

import cn.com.tjise.entity.OrdersEntity;
import cn.com.tjise.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrderByUserId/{userId}")
    public List<OrdersEntity> getOrderByUserId(@PathVariable Integer userId){
        return orderService.getAllOrderByUserId(userId);
    }

    @GetMapping("/getAllOrderByOrderStatus")
    public List<OrdersEntity> getOrderByOrderStatus(Integer orderStatus){
        return orderService.getAllOrderByOrderStatus(orderStatus);
    }
    @GetMapping("/getOrder/{orderId}")
    public OrdersEntity getOrderByOrderId(@PathVariable("orderId") Integer orderId){
        return orderService.getOrderByOrderId(orderId);
    }
    @PostMapping("/addOrder")
    public int addOrder(@RequestBody OrdersEntity order){
        return orderService.addOrder(order);
    }
    @PostMapping("/deleteOrder")
    public void deleteOrder(Integer orderId){
        orderService.deleteOrder(orderId);
    }

    @GetMapping("/getAllOrder")
    public List<OrdersEntity> getAllOrder(){return orderService.getAllOrder();}
}
