package cn.com.tjise.dao;

import cn.com.tjise.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

@Repository
public interface CarDao extends JpaRepository<CarEntity, Integer>, JpaSpecificationExecutor<CarEntity> {
    List<CarEntity> findAllByUserId(Integer UserId);
}
