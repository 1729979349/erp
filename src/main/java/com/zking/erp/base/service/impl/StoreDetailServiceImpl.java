package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.StoreDetailMapper;
import com.zking.erp.base.model.StoreDetail;
import com.zking.erp.base.service.IStoreDetailService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import com.zking.erp.base.vo.StoreDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StoreDetailServiceImpl implements IStoreDetailService {
    @Autowired
    private StoreDetailMapper storeDetailMapper;

    @Override
    public JsonResponseBody<?> deleteByPrimaryKey(Long storedetailId) {
        int i = storeDetailMapper.deleteByPrimaryKey(storedetailId);
        if(i<1)
            return new JsonResponseBody<>(ResponseStatus.STATUS_203);
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> insert(StoreDetail record) {
        int i = storeDetailMapper.insert(record);
        if(i<1)
            return new JsonResponseBody<>(ResponseStatus.STATUS_203);
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> insertSelective(StoreDetail record) {
        return null;
    }

    @Override
    public JsonResponseBody<?> selectByPrimaryKey(Long storedetailId) {
        return null;
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKeySelective(StoreDetail record) {
        return null;
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKey(StoreDetail record) {
        return null;
    }

    @Override
    public JsonResponseBody<?> selectAllPager(StoreDetail record,PageBean pageBean) {
        List<Map<StoreDetail, String>> maps = storeDetailMapper.selectAllPager(record);
        return new JsonResponseBody<>(maps,pageBean.getTotal());
//        List<StoreDetail> dicts = storeDetailMapper.selectAllPager(record);
//        return new JsonResponseBody<>(dicts,pageBean.getTotal());

    }

    @Override
    public JsonResponseBody<?> selectAPager(StoreDetailVo StoreDetailVo, PageBean pageBean) {
        List<Map<String, Object>> maps = storeDetailMapper.selectAPager(StoreDetailVo);
        return new JsonResponseBody<>(maps,pageBean.getTotal());
    }

    @Override
    public JsonResponseBody<?> selectWarningPager(StoreDetailVo storeDetailVo, PageBean pageBean) {
        List<Map<String,String>> list = storeDetailMapper.selectWarningPager(storeDetailVo);
        return new JsonResponseBody<>(list,pageBean.getTotal());
    }


}
