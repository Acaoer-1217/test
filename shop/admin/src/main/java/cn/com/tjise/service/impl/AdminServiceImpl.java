package cn.com.tjise.service.impl;

import cn.com.tjise.dao.AdminDao;
import cn.com.tjise.entity.AdminEntity;
import cn.com.tjise.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    /***
     * 管理员登录
     * @param adminUname
     * @param adminPassword
     * @return
     */
    @Override
    public AdminEntity LoginAdmin(String adminUname,String adminPassword) {
        AdminEntity ad = adminDao.findByAdminName(adminUname);
        if(ad!=null)
            return ad;
        else
            return null;
    }

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    @Override
    public int addAdmin(AdminEntity admin) {
        AdminEntity ad = adminDao.save(admin);
        if(ad!=null)
            return 1;
        else
            return 0;

    }

    /***
     * 更新管理员
     * @param admin
     * @return
     */
    @Override
    public int updateAdmin(AdminEntity admin) {
        AdminEntity ad = adminDao.save(admin);
        if(ad!=null)
            return 1;
        else
            return 0;
    }
}
