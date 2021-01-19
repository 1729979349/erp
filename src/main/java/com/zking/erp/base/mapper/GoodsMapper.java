package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GoodsMapper {
    /**
     * 删除商品信息
     * @param goodsId 商品ID
     * @return
     */
    int deleteByPrimaryKey(Long goodsId);

    /**
     * 添加商品
     * @param record
     * @return
     */
    int insert(Goods record);

    /**
     * 通过商品名称查询单个商品信息
     * @param goodsName
     * @return
     */
    Goods selectByPrimaryKey(String goodsName);

    /**
     * 修改商品信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Goods record);

    /**
     * 分页查询商品
     * @param goods
     * @return
     */
    List<Map<String,Object>>  queryGoodsPager(Goods goods);
}