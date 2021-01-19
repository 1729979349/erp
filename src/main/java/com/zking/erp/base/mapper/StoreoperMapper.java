package com.zking.erp.base.mapper;

import com.zking.erp.base.model.StoreDetail;
import com.zking.erp.base.model.Storeoper;
import com.zking.erp.base.vo.StoreoperVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreoperMapper {
    int deleteByPrimaryKey(Long storeoperId);

    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    Storeoper selectByPrimaryKey(Long storeoperId);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);

    List<Map<String,Object>> selectAllPager(StoreoperVo storeoperVo);

    int updateStoreoperStoreIdAndStoreoperGoodsId(StoreoperVo storeoperVo);
}