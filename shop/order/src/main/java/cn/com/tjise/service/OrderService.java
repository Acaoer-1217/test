package cn.com.tjise.service;


import cn.com.tjise.entity.OrdersEntity;

import java.util.List;

public interface OrderService {
   List<OrdersEntity> getAllOrderByUserId(Integer userId);

   List<OrdersEntity> getAllOrderByOrderStatus(Integer orderStatus);

   OrdersEntity getOrderByOrderId(Integer orderId);

   int addOrder(OrdersEntity order);

   void deleteOrder(Integer orderId);

   void updateOrder(OrdersEntity order);

   List<OrdersEntity> getAllOrder();

}
