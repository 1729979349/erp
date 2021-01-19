package com.zking.erp.base.service;

import com.zking.erp.base.model.Dep;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;

import java.util.List;


public interface IDepService {

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Long depId);

    int updateByPrimaryKeySelective(Dep record);

    /**
     * 新增部门信息
     * @param record
     * @return
     */
    JsonResponseBody<?> insert(Dep record);

    /**
     * 删除部门信息
     * @param depId
     * @return
     */
    JsonResponseBody<?> deleteByPrimaryKey(Long depId);

    /**
     * 修改部门信息
     * @param record
     * @return
     */
    JsonResponseBody<?> updateByPrimaryKey(Dep record);

    /**
     * 分页查询部门管理信息
     * @param dep
     * @return
     */
    JsonResponseBody<?> queryDepPager(Dep dep, PageBean pageBean);

    /**
     * 根据名称查询单个
     * @param DepName
     * @return
     */
    JsonResponseBody<?> selectDepByName(String DepName);


}