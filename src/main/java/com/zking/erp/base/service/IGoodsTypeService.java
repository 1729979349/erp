package com.zking.erp.base.service;

import com.zking.erp.base.model.GoodsType;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;


public interface IGoodsTypeService {
    /**
     * 删除商品类型
     * @param goodstypeId
     * @return
     */
    JsonResponseBody<?> deleteByPrimaryKey(Long goodstypeId);

    /**
     * 添加商品类型
     * @param record
     * @return
     */
    JsonResponseBody<?> insert(GoodsType record);

    /**
     * 通过ID查询某一条数据
     * @param goodstypeName
     * @return
     */
    JsonResponseBody<?> selectByPrimaryKey(String goodstypeName);

    /**
     * 修改某条数据信息
     * @param record
     * @return
     */
    JsonResponseBody<?> updateByPrimaryKey(GoodsType record);

    /**
     * 分页查询商品类型
     * @param goodsType
     * @return
     */
    JsonResponseBody<?> queryGoodsPagePager(GoodsType goodsType, PageBean pageBean);
}