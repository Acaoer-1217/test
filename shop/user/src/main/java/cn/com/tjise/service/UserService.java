package cn.com.tjise.service;

import cn.com.tjise.entity.AddressEntity;
import cn.com.tjise.entity.CarEntity;
import cn.com.tjise.entity.UserEntity;

import java.util.List;

public interface UserService {
    /***
     * 普通用户登录
     * @param userName
     * @param userPassword
     * @return
     */
    UserEntity LoginUser(String userName,String userPassword);

    /***
     * 根据id查找用户
     * @param userId
     * @return
     */
    UserEntity finUserById(Integer userId);

    /***
     * 查询所有用户
     * @return
     */
    List<UserEntity> getAllUser();

    /***
     * 用户注册
     * @param user
     * @return
     */
    int registerUser(UserEntity user);

    /***
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(UserEntity user);

    /***
     * 通过用户ID获取所有购物车
     * @param userId
     * @return
     */
    List<CarEntity> getAllCarByUserId(Integer userId);

    /***
     * 通过用户ID获取所有收件地址
     * @param userId
     * @return
     */
    List<AddressEntity> getAllAdressByUserId(Integer userId);

    /***
     * 更新购物车
     * @param car
     * @return
     */
    int updateCar(CarEntity car);

    /***
     * 添加购物车
     * @param car
     * @return
     */
    int addCar(CarEntity car);

    /***
     * 更新收件地址
     * @param address
     * @return
     */
    int updateAddress(AddressEntity address);

    /***
     * 添加收件地址
     * @param address
     * @return
     */
    int addAddress(AddressEntity address);

}
