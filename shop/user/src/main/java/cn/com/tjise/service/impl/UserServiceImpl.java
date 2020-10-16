package cn.com.tjise.service.impl;

import cn.com.tjise.dao.AddressDao;
import cn.com.tjise.dao.CarDao;
import cn.com.tjise.dao.UserDao;
import cn.com.tjise.entity.AddressEntity;
import cn.com.tjise.entity.CarEntity;
import cn.com.tjise.entity.UserEntity;
import cn.com.tjise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private CarDao carDao;
    @Autowired
    private AddressDao addressDao;

    /***
     * 普通用户登录
     * @param userName
     * @param userPassword
     * @return
     */
    @Override
    public UserEntity LoginUser(String userName, String userPassword) {
        UserEntity user = userDao.findByUserName(userName);
        if(user!=null){
            return user;
        }
        return null;
    }

    /***
     * 根据id查找用户
     * @param userId
     * @return
     */
    @Override
    public UserEntity finUserById(Integer userId) {
        Optional<UserEntity> optional = userDao.findById(userId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    /***
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserEntity> getAllUser() {
        List<UserEntity> list = userDao.findAll();
        return list;
    }

    /***
     * 用户注册
     * @param user
     * @return
     */
    @Transactional
    @Override
    public int registerUser(UserEntity user) {
        if(userDao.findByUserName(user.getUserName())==null){
           UserEntity u = userDao.save(user);
           if(u!=null)
            return 1;
        }
        return 0;
    }

    /***
     * 修改用户
     * @param user
     * @return
     */
    @Override
    public int updateUser(UserEntity user) {
        UserEntity u =userDao.save(user);
        if(u!=null)
            return 1;
        else
            return 0;
    }

    /***
     * 通过用户ID获取所有购物车
     * @param userId
     * @return
     */
    @Override
    public List<CarEntity> getAllCarByUserId(Integer userId) {
        List<CarEntity> carList = carDao.findAllByUserId(userId);
        return  carList;
    }

    /***
     * 通过用户ID获取所有收件地址
     * @param userId
     * @return
     */
    @Override
    public List<AddressEntity> getAllAdressByUserId(Integer userId) {
        List<AddressEntity> addressList = addressDao.findAllByUserId(userId);
        return addressList;
    }

    /***
     * 更新购物车
     * @param car
     * @return
     */
    @Override
    public int updateCar(CarEntity car) {
        CarEntity carEntity = carDao.save(car);
        if(carEntity!=null)
            return 1;
        else
            return 0;
    }

    /***
     * 添加购物车
     * @param car
     * @return
     */
    @Override
    public int addCar(CarEntity car) {
        CarEntity carEntity = carDao.save(car);
        if(car!=null)
            return 1;
        else
            return 0;
    }

    /***
     * 更新收件地址
     * @param address
     * @return
     */
    @Override
    public int updateAddress(AddressEntity address) {
        AddressEntity addressEntity = addressDao.save(address);
        if(addressEntity!=null)
            return 1;
        else
            return 0;
    }

    /***
     * 添加收件地址
     * @param address
     * @return
     */
    @Override
    public int addAddress(AddressEntity address) {
        AddressEntity addressEntity = addressDao.save(address);
        if(addressEntity!=null)
            return 1;
        else
            return 0;
    }
}
