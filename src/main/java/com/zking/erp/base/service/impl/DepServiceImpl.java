package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.DepMapper;
import com.zking.erp.base.model.Dep;
import com.zking.erp.base.service.IDepService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepServiceImpl implements IDepService {
    @Autowired
    private DepMapper depMapper;

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

    /**
     * 新增部门信息
     * @param record
     * @return
     */
    @Override
    public JsonResponseBody<?> insert(Dep record) {
        Dep dep = depMapper.selectDepByName(record.getDepName());
        if(null!=dep) {
            return new JsonResponseBody<>(ResponseStatus.STATUS_252);
        }else {
            int i = depMapper.insert(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_253);
        }
    }

    /**
     * 删除部门信息
     * @param depId
     * @return
     */
    @Override
    public JsonResponseBody<?> deleteByPrimaryKey(Long depId) {
        int i = depMapper.deleteByPrimaryKey(depId);
        if(i<1) {
            return new JsonResponseBody<>(ResponseStatus.STATUS_254);
        }
            return new JsonResponseBody<>(ResponseStatus.STATUS_255);
    }

    /**
     * 修改部门信息
     * @param record
     * @return
     */
    @Override
    public JsonResponseBody<?> updateByPrimaryKey(Dep record) {
        Dep dep = depMapper.selectDepByName(record.getDepName());
        if (null==dep){
            int i = depMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_267);
        }else if (record.getDepId()==dep.getDepId()&&dep.getDepName().equals(record.getDepName())){
            int i = depMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_267);
        }else{
            return new JsonResponseBody<>(ResponseStatus.STATUS_509);
        }
    }

    /**
     * 分页查询部门管理信息
     * @param dep
     * @param pageBean
     * @return
     */
    @Override
    public JsonResponseBody<?> queryDepPager(Dep dep,PageBean pageBean) {
        List<Dep> deps = depMapper.queryDepPager(dep);
        if(deps==null)
            return new JsonResponseBody<>(ResponseStatus.STATUS_258);
        return new JsonResponseBody<>(deps,pageBean.getTotal());
    }

    /**
     * 根据名称查询单个
     * @param DepName
     * @return
     */
    @Override
    public JsonResponseBody<?> selectDepByName(String DepName) {
        Dep dep = depMapper.selectDepByName(DepName);
        if(null==dep)
            return new JsonResponseBody<>(ResponseStatus.STATUS_258);
        return new JsonResponseBody<>(ResponseStatus.STATUS_259);
    }
}
