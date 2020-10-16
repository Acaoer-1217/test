package cn.com.tjise.dao;

import cn.com.tjise.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrdersDao extends JpaRepository<OrdersEntity, Integer>, JpaSpecificationExecutor<OrdersEntity> {
    List<OrdersEntity> findAllByUserId(Integer userId);

    List<OrdersEntity> findAllByOrdersStatus(Integer ordersStatus);

}
