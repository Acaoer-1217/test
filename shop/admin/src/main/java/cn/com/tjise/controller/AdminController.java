package cn.com.tjise.controller;


import cn.com.tjise.entity.AdminEntity;
import cn.com.tjise.service.AdminService;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
//@CrossOrigin
public class AdminController {
    @Autowired
    private AdminService adminService;
    private HttpSession session;

    /***
     * 管理员登录
     * @param adminUname
     * @param adminPassword
     * @return
     */
    @PostMapping("/adminlogin")
    public AdminEntity LoginAdmin(String adminUname,String adminPassword){
       return  adminService.LoginAdmin(adminUname,adminPassword);
    }

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    @PostMapping("/addAdmin")
    public Integer addAdmin(@RequestBody AdminEntity admin){
        return adminService.addAdmin(admin);
    }

    /***
     * 更新管理员
     * @param admin
     * @return
     */
    @PostMapping("/updateAdmin")
    public Integer updateAdmin(@RequestBody AdminEntity admin){
        return adminService.addAdmin(admin);
    }
}
