package cn.com.tjise.controller;


import cn.com.tjise.entity.GoodsEntity;
import cn.com.tjise.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getAllGoodsByCategoryId")
    public List<GoodsEntity> getGoodsByPaging(Integer categoryId, Integer pageNum, Integer pageSize){
        if(pageNum==null)
            pageNum=1;
        if( pageSize==null)
            pageSize=6;
             return goodsService.getAllGoodsByCategoryIdAndByPaging(categoryId,pageNum,pageSize);
    }
    @GetMapping("/serachGoogByPageing")
    public List<GoodsEntity> serachGoodsByPageing(String keyWord,Integer pageNum,Integer pageSize){
        if(pageNum==null)
            pageNum=1;
        if(pageSize==null)
            pageSize=5;
        return goodsService.searchGoodsPaging(keyWord,pageNum,pageSize);
         }

    @GetMapping("/goods/{goodsId}")
    public GoodsEntity findGoodById(@PathVariable ("goodsId") Integer goodsId){
        return goodsService.findById(goodsId);
    }

    @PostMapping("/addGoods")
    public int addGoods(@RequestBody GoodsEntity goods){
        return goodsService.addGoods(goods);
    }

    @PostMapping("/updateGoods")
    public void updateGoods(@RequestBody GoodsEntity goods){
        goodsService.updateGoods(goods);
    }
    @PostMapping("/deleteGoods")
    public void deleteGoodsById(@RequestBody Integer goodsId ){
         goodsService.deleteGoodsById(goodsId);
    }

    @PostMapping("/deleteGoodsByCatrgoryId")
    public void deleterGoodsByCategoryId(@RequestBody Integer categoryId){
         goodsService.deleteGoodsByCategoryId(categoryId);
    }

    @GetMapping("/getAllGoods")
    public List<GoodsEntity> getAllGoods(){
        return goodsService.getALLGoods();
    }

}
