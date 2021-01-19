package com.zking.erp.base.mapper;

import com.zking.erp.base.model.GoodsType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsTypeMapper {
    /**
     * 删除商品类型
     * @param goodstypeId 商品类型ID
     * @return
     */
    int deleteByPrimaryKey(Long goodstypeId);

    /**
     * 添加商品类型
     * @param record
     * @return
     */
    int insert(GoodsType record);

    /**
     * 通过ID查询某一条数据
     * @param goodstypeName 商品类型名字
     * @return
     */
    GoodsType selectByPrimaryKey(String goodstypeName);

    /**
     * 修改某条数据信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(GoodsType record);

    /**
     * 分页查询商品类型
     * @param goodsType
     * @return
     */
    List<GoodsType> queryGoodsPagePager(GoodsType goodsType);

}