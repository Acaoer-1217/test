package cn.com.tjise.service;

import cn.com.tjise.entity.AdminEntity;

public interface AdminService {
    /***
     * 管理员登录
     * @param adminUname
     * @param adminPassword
     * @return
     */
    AdminEntity LoginAdmin(String adminUname,String adminPassword);

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    int addAdmin(AdminEntity admin);

    /***
     * 更新管理员
     * @param admin
     * @return
     */
    int updateAdmin(AdminEntity admin);
}
