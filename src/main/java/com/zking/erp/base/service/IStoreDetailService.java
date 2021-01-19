package com.zking.erp.base.service;

import com.zking.erp.base.model.StoreDetail;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.vo.StoreDetailVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface IStoreDetailService {
    JsonResponseBody<?> deleteByPrimaryKey(Long storedetailId);

    JsonResponseBody<?> insert(StoreDetail record);

    JsonResponseBody<?> insertSelective(StoreDetail record);

    JsonResponseBody<?> selectByPrimaryKey(Long storedetailId);

    JsonResponseBody<?> updateByPrimaryKeySelective(StoreDetail record);

    JsonResponseBody<?> updateByPrimaryKey(StoreDetail record);

//    JsonResponseBody<?> selectAllPager(StoreDetail record, PageBean pageBean);

    JsonResponseBody<?> selectAllPager(StoreDetail record,PageBean pageBean);

    JsonResponseBody<?> selectAPager(StoreDetailVo storeDetailVo, PageBean pageBean);

    /**
     * 分页查询库存预警
     * @param pageBean
     * @return
     */
    JsonResponseBody<?> selectWarningPager(StoreDetailVo storeDetailVo,PageBean pageBean);
}