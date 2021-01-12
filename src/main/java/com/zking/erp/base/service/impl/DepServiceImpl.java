package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.DepMapper;
import com.zking.erp.base.model.Dep;
import com.zking.erp.base.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepServiceImpl implements IDepService {
    @Autowired
    private DepMapper depMapper;

    @Override
    public int deleteByPrimaryKey(Long depId) {
        return depMapper.deleteByPrimaryKey(depId);
    }

    @Override
    public int insert(Dep record) {
        return depMapper.insert(record);
    }

    @Override
    public int insertSelective(Dep record) {
        return depMapper.insertSelective(record);
    }

    @Override
    public Dep selectByPrimaryKey(Long depId) {
        return depMapper.selectByPrimaryKey(depId);
    }

    @Override
    public int updateByPrimaryKeySelective(Dep record) {
        return depMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dep record) {
        return depMapper.updateByPrimaryKey(record);
    }
}
