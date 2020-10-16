package cn.com.tjise.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orderdetail", schema = "training", catalog = "")
public class OrderdetailEntity {
    private int detailId;
    private Integer orderId;
    private Integer goodsId;
    private Integer goosCount;

    @Id
    @Column(name = "detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    @Basic
    @Column(name = "order_id")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "goods_id")
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goos_count")
    public Integer getGoosCount() {
        return goosCount;
    }

    public void setGoosCount(Integer goosCount) {
        this.goosCount = goosCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderdetailEntity that = (OrderdetailEntity) o;
        return detailId == that.detailId &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(goodsId, that.goodsId) &&
                Objects.equals(goosCount, that.goosCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailId, orderId, goodsId, goosCount);
    }
}
