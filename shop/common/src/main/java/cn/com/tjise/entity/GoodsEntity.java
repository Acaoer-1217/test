package cn.com.tjise.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "goods", schema = "training", catalog = "")
public class GoodsEntity {
    private int goodsId;
    private String goodsName;
    private Double goodsPrice;
    private String goodsDesc;
    private String goodsImg;
    private int categoryId;
    private Timestamp goodsCtime;

    @Id
    @Column(name = "goods_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "goods_price")
    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Basic
    @Column(name = "goods_desc")
    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    @Basic
    @Column(name = "goods_img")
    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    @Basic
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "goods_ctime")
    public Timestamp getGoodsCtime() {
        return goodsCtime;
    }

    public void setGoodsCtime(Timestamp goodsCtime) {
        this.goodsCtime = goodsCtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsEntity that = (GoodsEntity) o;
        return goodsId == that.goodsId &&
                categoryId == that.categoryId &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(goodsPrice, that.goodsPrice) &&
                Objects.equals(goodsDesc, that.goodsDesc) &&
                Objects.equals(goodsImg, that.goodsImg) &&
                Objects.equals(goodsCtime, that.goodsCtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, goodsName, goodsPrice, goodsDesc, goodsImg, categoryId, goodsCtime);
    }
}
