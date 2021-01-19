package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Store;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreMapper {
    /**
     *删除仓库信息
     * @param storeId
     * @return
     */
    int deleteByPrimaryKey(Long storeId);

    /**
     *添加仓库信息
     * @param record
     * @return
     */
    int insert(Store record);

    /**
     *根据仓库名查询单个商品信息
     * @param
     * @return
     */
    Store selectByPrimaryKey(String storeName);

    /**
     *修改仓库信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Store record);

    /**
     * 分页查询仓库信息
     * @param store
     * @return
     */
    List<Map<String,Object>> queryStorerPager(Store store);



}