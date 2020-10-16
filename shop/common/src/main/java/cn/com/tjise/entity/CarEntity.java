package cn.com.tjise.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "car", schema = "training", catalog = "")
public class CarEntity {
    private int carId;
    private int userId;
    private int goodsId;
    private int goodsNum;
    private double carAmount;
    private Timestamp carCtime;

    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "goods_id")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_num")
    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    @Basic
    @Column(name = "car_amount")
    public double getCarAmount() {
        return carAmount;
    }

    public void setCarAmount(double carAmount) {
        this.carAmount = carAmount;
    }

    @Basic
    @Column(name = "car_ctime")
    public Timestamp getCarCtime() {
        return carCtime;
    }

    public void setCarCtime(Timestamp carCtime) {
        this.carCtime = carCtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEntity carEntity = (CarEntity) o;
        return carId == carEntity.carId &&
                userId == carEntity.userId &&
                goodsId == carEntity.goodsId &&
                goodsNum == carEntity.goodsNum &&
                Double.compare(carEntity.carAmount, carAmount) == 0 &&
                Objects.equals(carCtime, carEntity.carCtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, userId, goodsId, goodsNum, carAmount, carCtime);
    }
}
