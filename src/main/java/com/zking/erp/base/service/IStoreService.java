package com.zking.erp.base.service;

import com.zking.erp.base.model.Store;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;

public interface IStoreService {
    /**
     *删除仓库信息
     * @param storeId
     * @return
     */
    JsonResponseBody<?> deleteByPrimaryKey(Long storeId);

    /**
     *添加仓库信息
     * @param record
     * @return
     */
    JsonResponseBody<?> insert(Store record);

    /**
     *根据仓库名查询单个商品信息
     * @param
     * @return
     */
    JsonResponseBody<?> selectByPrimaryKey(String storeName);

    /**
     *修改仓库信息
     * @param record
     * @return
     */
    JsonResponseBody<?> updateByPrimaryKey(Store record);

    /**
     * 分页查询仓库信息
     * @param store
     * @return
     */
    JsonResponseBody<?> queryStorerPager(Store store, PageBean pageBean);


}