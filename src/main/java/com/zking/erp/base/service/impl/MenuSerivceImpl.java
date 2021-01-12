package com.zking.erp.base.service.impl;

import com.zking.erp.base.mapper.MenuMapper;
import com.zking.erp.base.model.Menu;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.ResponseStatus;
import com.zking.erp.base.service.IMenuSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuSerivceImpl implements IMenuSerivce {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public JsonResponseBody<?> queryMenuList() {
        List<Menu> menus = menuMapper.queryMenuList("-1");
        for (Menu menu : menus) {
            this.queryMenuByIdList(menu.getMenuId(),menu);
        }
        if(menus==null)
            return new JsonResponseBody<>(ResponseStatus.STATUS_202);

        return new JsonResponseBody<>(menus);
    }


    /**
     * 根据id查询父节点下的所有子节点
     * @param menuId
     * @param menu
     * @return
     */
    private List<Menu> queryMenuByIdList(String menuId, Menu menu) {
        List<Menu> menuss = menuMapper.queryMenuByIdList(menuId, menu);

        menu.setMlist(menuss);
        return menuss;
    }


}
