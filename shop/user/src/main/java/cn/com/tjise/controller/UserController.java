package cn.com.tjise.controller;

import cn.com.tjise.entity.AddressEntity;
import cn.com.tjise.entity.CarEntity;
import cn.com.tjise.entity.UserEntity;
import cn.com.tjise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserEntity login(String userName, String userPassword) {
        return userService.LoginUser(userName,userPassword);
    }


    @PostMapping("/register")
    public Integer register(@RequestBody UserEntity user) {
        return userService.registerUser(user);
    }

    @PostMapping("/update")
    public Integer update(@RequestBody UserEntity user) {
        return userService.updateUser(user);
    }

    @GetMapping("/user/{userId}")
    public UserEntity getUserById(@PathVariable Integer userId){
        return userService.finUserById(userId);
    }

    @GetMapping("/user/getAll")
    public List<UserEntity> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/user/getAllCar/{userId}")
    public List<CarEntity> getAllCarByUserId(@PathVariable ("userId") Integer userId){
        return userService.getAllCarByUserId(userId);
    }

    @GetMapping("/user/getAllAdress/{userId}")
    public List<AddressEntity> getAllAdressByUserId(@PathVariable("userId") Integer userId){
        return userService.getAllAdressByUserId(userId);
    }
    @PostMapping("/user/updatecar")
    public int updateCar(@RequestBody  CarEntity car){
        return userService.updateCar(car);
    }
    @PostMapping("/user/addCar")
    public int addCar(@RequestBody CarEntity car){
        return userService.addCar(car);
    }

    @PostMapping("/user/addAddress")
    public int addAddress(@RequestBody AddressEntity address){
        return userService.addAddress(address);
    }
    @PostMapping("/user/updateAddress")
    public int updateAddress(@RequestBody AddressEntity address){
        return userService.addAddress(address);
    }


}
