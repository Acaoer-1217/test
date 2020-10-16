package cn.com.tjise.dao;

import cn.com.tjise.entity.GoodsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

@Repository
public interface GoodsDao extends JpaRepository<GoodsEntity, Integer>, JpaSpecificationExecutor<GoodsEntity> {
    int deleteByCategoryId(int categoryId);

    Page<GoodsEntity> findAllByCategoryId(int categoryId,Pageable pageable);



}
