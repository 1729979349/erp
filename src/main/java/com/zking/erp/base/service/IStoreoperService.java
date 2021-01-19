package com.zking.erp.base.service;

import com.zking.erp.base.model.StoreDetail;
import com.zking.erp.base.model.Storeoper;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.vo.StoreoperVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface IStoreoperService {
    int deleteByPrimaryKey(Long storeoperId);

    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    Storeoper selectByPrimaryKey(Long storeoperId);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);

    JsonResponseBody<?> selectAllPager(StoreoperVo storeoperVo, PageBean pageBean);

}