package cn.com.tjise.dao;

import cn.com.tjise.entity.OrderdetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@Repository
public interface OrderdetailDao extends JpaRepository<OrderdetailEntity, Integer>, JpaSpecificationExecutor<OrderdetailEntity> {
}
