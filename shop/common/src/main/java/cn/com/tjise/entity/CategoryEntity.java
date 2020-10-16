package cn.com.tjise.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "training", catalog = "")
public class CategoryEntity {
    private int categoryId;
    private String categoryName;
    private String categoryDesc;

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "category_desc")
    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return categoryId == that.categoryId &&
                Objects.equals(categoryName, that.categoryName) &&
                Objects.equals(categoryDesc, that.categoryDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName, categoryDesc);
    }
}
