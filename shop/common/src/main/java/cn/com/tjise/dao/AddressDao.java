package cn.com.tjise.dao;

import cn.com.tjise.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AddressDao extends JpaRepository<AddressEntity, Integer>, JpaSpecificationExecutor<AddressEntity> {
    List<AddressEntity> findAllByUserId(Integer userId);
}
