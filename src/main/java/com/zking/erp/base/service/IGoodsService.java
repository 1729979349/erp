package com.zking.erp.base.service;

import com.zking.erp.base.model.Goods;
import com.zking.erp.base.model.GoodsType;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IGoodsService {
    /**
     * 删除商品信息
     * @param goodsId 商品ID
     * @return
     */
    JsonResponseBody<?> deleteByPrimaryKey(Long goodsId);

    /**
     * 添加商品
     * @param record
     * @return
     */
    JsonResponseBody<?> insert(Goods record);

    /**
     * 通过商品名称查询单个商品信息
     * @param goodsName
     * @return
     */
    JsonResponseBody<?> selectByPrimaryKey(String goodsName);

    /**
     * 修改商品信息
     * @param record
     * @return
     */
    JsonResponseBody<?> updateByPrimaryKey(Goods record);

    /**
     * 分页查询商品
     * @param goods
     * @return
     */
    JsonResponseBody<?> queryGoodsPager(Goods goods, PageBean pageBean);

}