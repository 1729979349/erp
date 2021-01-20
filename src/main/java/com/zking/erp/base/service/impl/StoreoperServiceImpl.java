package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.StoreoperMapper;
import com.zking.erp.base.model.Storeoper;
import com.zking.erp.base.service.IStoreoperService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.vo.StoreoperVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StoreoperServiceImpl implements IStoreoperService {
    @Autowired
    private StoreoperMapper storeoperMapper;
    @Override
    public int deleteByPrimaryKey(Long storeoperId) {
        return storeoperMapper.deleteByPrimaryKey(storeoperId);
    }

    @Override
    public int insert(Storeoper record) {
        return storeoperMapper.insert(record);
    }

    @Override
    public int insertSelective(Storeoper record) {
        return storeoperMapper.insertSelective(record);
    }

    @Override
    public Storeoper selectByPrimaryKey(Long storeoperId) {
        return storeoperMapper.selectByPrimaryKey(storeoperId);
    }

    @Override
    public int updateByPrimaryKeySelective(Storeoper record) {
        return storeoperMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Storeoper record) {
        return storeoperMapper.updateByPrimaryKey(record);
    }

    @Override
    public JsonResponseBody<?> selectAllPager(StoreoperVo storeoperVo, PageBean pageBean) {
        List<Map<String, Object>> maps =storeoperMapper.selectAllPager(storeoperVo);
        return new JsonResponseBody<>(maps,pageBean.getTotal());
    }
}
