package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.ReturnordersMapper;
import com.zking.erp.base.model.Returnorders;
import com.zking.erp.base.service.IReturnordersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnordersServiceImpl implements IReturnordersService {
    @Autowired
    private ReturnordersMapper returnordersMapper;

    @Override
    public int deleteByPrimaryKey(Long returnordersId) {
        return 0;
    }

    @Override
    public int insert(Returnorders record) {
        return 0;
    }

    @Override
    public int insertSelective(Returnorders record) {
        return 0;
    }

    @Override
    public Returnorders selectByPrimaryKey(Long returnordersId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Returnorders record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Returnorders record) {
        return 0;
    }
}
