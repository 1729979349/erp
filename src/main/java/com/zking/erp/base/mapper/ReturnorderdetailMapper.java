package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Returnorderdetail;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnorderdetailMapper {
    int deleteByPrimaryKey(Long returnorderdetailId);

    int insert(Returnorderdetail record);

    int insertSelective(Returnorderdetail record);

    Returnorderdetail selectByPrimaryKey(Long returnorderdetailId);

    int updateByPrimaryKeySelective(Returnorderdetail record);

    int updateByPrimaryKey(Returnorderdetail record);
}