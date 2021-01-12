package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.EmpMapper;
import com.zking.erp.base.model.Emp;
import com.zking.erp.base.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public int deleteByPrimaryKey(Long empId) {
        return empMapper.deleteByPrimaryKey(empId);
    }

    @Override
    public int insert(Emp record) {
        return empMapper.insert(record);
    }

    @Override
    public int insertSelective(Emp record) {
        return empMapper.insertSelective(record);
    }

    @Override
    public Emp selectByPrimaryKey(Long empId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Emp record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Emp record) {
        return 0;
    }
}
