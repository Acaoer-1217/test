package cn.com.tjise.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "training", catalog = "")
public class OrdersEntity {
    private int ordersId;
    private String ordersNumber;
    private Double ordersAmount;
    private String ordersCity;
    private String ordersProvicnes;
    private String ordersStreet;
    private String ordersContact;
    private String ordersPhone;
    private Integer userId;
    private Timestamp ordersCtime;
    private Integer ordersStatus;

    @Id
    @Column(name = "orders_id")
    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    @Basic
    @Column(name = "orders_number")
    public String getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(String ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    @Basic
    @Column(name = "orders_amount")
    public Double getOrdersAmount() {
        return ordersAmount;
    }

    public void setOrdersAmount(Double ordersAmount) {
        this.ordersAmount = ordersAmount;
    }

    @Basic
    @Column(name = "orders_city")
    public String getOrdersCity() {
        return ordersCity;
    }

    public void setOrdersCity(String ordersCity) {
        this.ordersCity = ordersCity;
    }

    @Basic
    @Column(name = "orders_provicnes")
    public String getOrdersProvicnes() {
        return ordersProvicnes;
    }

    public void setOrdersProvicnes(String ordersProvicnes) {
        this.ordersProvicnes = ordersProvicnes;
    }

    @Basic
    @Column(name = "orders_street")
    public String getOrdersStreet() {
        return ordersStreet;
    }

    public void setOrdersStreet(String ordersStreet) {
        this.ordersStreet = ordersStreet;
    }

    @Basic
    @Column(name = "orders_contact")
    public String getOrdersContact() {
        return ordersContact;
    }

    public void setOrdersContact(String ordersContact) {
        this.ordersContact = ordersContact;
    }

    @Basic
    @Column(name = "orders_phone")
    public String getOrdersPhone() {
        return ordersPhone;
    }

    public void setOrdersPhone(String ordersPhone) {
        this.ordersPhone = ordersPhone;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "orders_ctime")
    public Timestamp getOrdersCtime() {
        return ordersCtime;
    }

    public void setOrdersCtime(Timestamp ordersCtime) {
        this.ordersCtime = ordersCtime;
    }

    @Basic
    @Column(name = "orders_status")
    public Integer getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(Integer ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return ordersId == that.ordersId &&
                Objects.equals(ordersNumber, that.ordersNumber) &&
                Objects.equals(ordersAmount, that.ordersAmount) &&
                Objects.equals(ordersCity, that.ordersCity) &&
                Objects.equals(ordersProvicnes, that.ordersProvicnes) &&
                Objects.equals(ordersStreet, that.ordersStreet) &&
                Objects.equals(ordersContact, that.ordersContact) &&
                Objects.equals(ordersPhone, that.ordersPhone) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(ordersCtime, that.ordersCtime) &&
                Objects.equals(ordersStatus, that.ordersStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersId, ordersNumber, ordersAmount, ordersCity, ordersProvicnes, ordersStreet, ordersContact, ordersPhone, userId, ordersCtime, ordersStatus);
    }
}
