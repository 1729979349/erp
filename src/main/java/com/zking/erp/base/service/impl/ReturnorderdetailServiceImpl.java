package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.ReturnorderdetailMapper;
import com.zking.erp.base.model.Returnorderdetail;
import com.zking.erp.base.service.IReturnorderdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnorderdetailServiceImpl implements IReturnorderdetailService {
    @Autowired
    private ReturnorderdetailMapper returnorderdetailMapper;

    @Override
    public int deleteByPrimaryKey(Long returnorderdetailId) {
        return 0;
    }

    @Override
    public int insert(Returnorderdetail record) {
        return 0;
    }

    @Override
    public int insertSelective(Returnorderdetail record) {
        return 0;
    }

    @Override
    public Returnorderdetail selectByPrimaryKey(Long returnorderdetailId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Returnorderdetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Returnorderdetail record) {
        return 0;
    }
}
