package cn.com.tjise.service;

import cn.com.tjise.entity.GoodsEntity;

import java.util.List;

public interface GoodsService {
    List<GoodsEntity> getALLGoods();

    List<GoodsEntity> getAllGoodsByCategoryIdAndByPaging(int categoryId,int pageNum,int pageSize);

    List<GoodsEntity> searchGoodsPaging(String keyWord,int pageNum,int pageSize);

    GoodsEntity findById(int goodsId);

    int addGoods(GoodsEntity goods);

    void deleteGoodsById(int goodsId);

    void updateGoods(GoodsEntity goods);

    void deleteGoodsByCategoryId(int categoryId);
}
