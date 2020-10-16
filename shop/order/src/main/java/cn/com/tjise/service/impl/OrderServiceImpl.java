package cn.com.tjise.service.impl;

import cn.com.tjise.dao.OrdersDao;
import cn.com.tjise.entity.OrdersEntity;
import cn.com.tjise.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrdersDao ordersDao;

    @Override
    public List<OrdersEntity> getAllOrderByUserId(Integer userId) {
        List<OrdersEntity> orderList = ordersDao.findAllByUserId(userId);
        if(orderList!=null)
            return orderList;
        else
            return null;
    }

    @Override
    public List<OrdersEntity> getAllOrderByOrderStatus(Integer ordersStatus) {
        List<OrdersEntity> orderList = ordersDao.findAllByOrdersStatus(ordersStatus);
        if(orderList!=null)
            return orderList;
        else
            return null;
    }

    @Override
    public OrdersEntity getOrderByOrderId(Integer ordersId) {
        Optional<OrdersEntity> order = ordersDao.findById(ordersId);
        if(order.isPresent())
            return order.get();
        else
            return null;

    }

    @Override
    public int addOrder(OrdersEntity orders) {
        orders.setOrdersNumber(genOrderNumber());
        orders.setOrdersStatus(0);
        orders.setOrdersCtime(new Timestamp(System.currentTimeMillis()));
        OrdersEntity o = ordersDao.save(orders);
        if(o!=null)
            return 1;
        else
            return 0;

    }

    public String genOrderNumber(){
        StringBuffer sb = new StringBuffer();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        sb.append(format.format(new Date()));
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            sb.append((int) (rnd.nextDouble() * 10));
        }
        return sb.toString();
    }

    @Override
    public void deleteOrder(Integer orderId) {
        ordersDao.deleteById(orderId);
    }

    @Override
    public void updateOrder(OrdersEntity order) {
        ordersDao.save(order);
    }

    @Override
    public List<OrdersEntity> getAllOrder() {
        List<OrdersEntity> list = ordersDao.findAll();
        return list;
    }
}
