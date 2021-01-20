package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.StoreMapper;
import com.zking.erp.base.model.Store;
import com.zking.erp.base.service.IStoreService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StoreServiceImpl implements IStoreService {
    @Autowired
    private StoreMapper storeMapper;


    @Override
    public JsonResponseBody<?> deleteByPrimaryKey(Long storeId) {
        int i = storeMapper.deleteByPrimaryKey(storeId);
        if(i<1)
            return new JsonResponseBody<>(ResponseStatus.STATUS_502);
        return new JsonResponseBody<>(ResponseStatus.STATUS_503);
    }

    @Override
    public JsonResponseBody<?> insert(Store record) {
        Store store = storeMapper.selectByPrimaryKey(record.getStoreName());
        System.out.println("子文妹妹"+store);
        if(null!=store){
            return new JsonResponseBody<>(ResponseStatus.STATUS_508);
        }else{
            int i = storeMapper.insert(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_505);
        }
    }

    @Override
    public JsonResponseBody<?> selectByPrimaryKey(String storeName) {
        Store store = storeMapper.selectByPrimaryKey(storeName);
        if(null==storeName)
            return new JsonResponseBody<>(ResponseStatus.STATUS_501);
        return new JsonResponseBody<>(storeName);
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKey(Store record) {
        Store store = storeMapper.selectByPrimaryKey(record.getStoreName());
        if (null==store){
            System.out.println("1111111111111111");
            int i = storeMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_507);
        }else if (record.getStoreId()==store.getStoreId()&&store.getStoreName().equals(record.getStoreName())){
            System.out.println("22222222222222222");
            int i = storeMapper.updateByPrimaryKey(record);
            return new JsonResponseBody<>(ResponseStatus.STATUS_507);
        }else{
            System.out.println("33333333333333333");
            return new JsonResponseBody<>(ResponseStatus.STATUS_509);
        }

    }

    @Override
    public JsonResponseBody<?> queryStorerPager(Store store, PageBean pageBean) {
        List<Map<String,Object>> list = storeMapper.queryStorerPager(store);
        return new JsonResponseBody<>(list,pageBean.getTotal());
    }


}
