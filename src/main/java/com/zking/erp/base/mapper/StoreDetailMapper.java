package com.zking.erp.base.mapper;

import com.zking.erp.base.model.StoreDetail;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.vo.StoreDetailVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreDetailMapper {
    int deleteByPrimaryKey(Long storedetailId);

    int insert(StoreDetail record);

    int insertSelective(StoreDetail record);

    StoreDetail selectByPrimaryKey(Long storedetailId);

    int updateByPrimaryKeySelective(StoreDetail record);

    int updateByPrimaryKey(StoreDetail record);

    List<Map<StoreDetail,String>> selectAllPager(StoreDetail record);

    List<Map<String,Object>> selectAPager(StoreDetailVo storeDetailVo);

    StoreDetail queryStoredetailStoreIdAndStoredetailGoodsId(StoreDetail storeDetail);
    /**
     * 查询库存预警数量
     * @return
     */
    List<Map<String,String>> selectWarningPager(StoreDetailVo storeDetailVo);

}