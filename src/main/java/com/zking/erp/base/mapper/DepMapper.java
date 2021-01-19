package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Dep;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepMapper {
    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Long depId);

    int updateByPrimaryKeySelective(Dep record);

    /**
     * 新增部门信息
     * @param record
     * @return
     */
    int insert(Dep record);

    /**
     * 删除部门信息
     * @param depId
     * @return
     */
    int deleteByPrimaryKey(Long depId);

    /**
     * 修改部门信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Dep record);

    /**
     * 分页查询部门管理信息
     * @param dep
     * @return
     */
    List<Dep> queryDepPager(Dep dep);

    /**
     * 根据名称查询单个
     * @param DepName
     * @return
     */
    Dep selectDepByName(String DepName);

}