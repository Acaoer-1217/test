package cn.com.tjise.dao;

import cn.com.tjise.entity.AdminEntity;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface AdminDao extends JpaRepository<AdminEntity, Integer>, JpaSpecificationExecutor<AdminEntity> {
    AdminEntity findByAdminName(String adminName);
}
