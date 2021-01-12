package com.zking.erp.base.service;

import com.zking.erp.base.model.Returnorderdetail;
import org.springframework.stereotype.Repository;

public interface IReturnorderdetailService {
    int deleteByPrimaryKey(Long returnorderdetailId);

    int insert(Returnorderdetail record);

    int insertSelective(Returnorderdetail record);

    Returnorderdetail selectByPrimaryKey(Long returnorderdetailId);

    int updateByPrimaryKeySelective(Returnorderdetail record);

    int updateByPrimaryKey(Returnorderdetail record);
}