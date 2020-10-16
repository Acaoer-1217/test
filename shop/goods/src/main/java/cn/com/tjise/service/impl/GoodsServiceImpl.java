package cn.com.tjise.service.impl;

import cn.com.tjise.dao.GoodsDao;
import cn.com.tjise.entity.GoodsEntity;
import cn.com.tjise.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<GoodsEntity> getALLGoods() {

        return goodsDao.findAll();
    }

    @Override
    public List<GoodsEntity> getAllGoodsByCategoryIdAndByPaging(int categoryId, int pageNum, int pageSize) {
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        Page<GoodsEntity> page =  goodsDao.findAllByCategoryId(categoryId,pageable);
        return page.getContent();
    }

    @Override
    public List<GoodsEntity> searchGoodsPaging(String keyWord, int pageNum, int pageSize) {
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        Specification<GoodsEntity> specification = new Specification<GoodsEntity>() {
            @Override
            public Predicate toPredicate(Root<GoodsEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Predicate predicate = criteriaBuilder.or(criteriaBuilder.like(root.get("goodsName"), "%" + keyWord + "%"), criteriaBuilder.like(root.get("goodsDesc"), "%" + keyWord + "%"));
                return predicate;
            }
        };
        Page<GoodsEntity> page = goodsDao.findAll(specification, pageable);
        return page.getContent();
    }


    @Override
    public GoodsEntity findById(int goodsId) {
        Optional<GoodsEntity> goods = goodsDao.findById(goodsId);
        if(goods.isPresent())
            return goods.get();
        else
            return null;
    }

    @Override
    public int addGoods(GoodsEntity goods) {
        GoodsEntity good = goodsDao.save(goods);
        if(good!=null)
            return 1;
        else
            return 0;
    }

    @Override
    public void deleteGoodsById(int goodsId) {
        goodsDao.deleteById(goodsId);

    }

    @Override
    public void updateGoods(GoodsEntity goods) {
        GoodsEntity goodsEntity = goodsDao.save(goods);
    }

    @Override
    public void deleteGoodsByCategoryId(int categoryId) {
        goodsDao.deleteByCategoryId(categoryId);
    }
}
