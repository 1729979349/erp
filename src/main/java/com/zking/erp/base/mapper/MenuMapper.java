package com.zking.erp.base.mapper;

import com.zking.erp.base.model.Menu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    int deleteByPrimaryKey(String menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    /**
     *查询父节点
     * @param menuPid
     * @return
     */
    List<Menu> queryMenuList(String menuPid);

    /**
     * 根据id查询子节点
     * @param menuId
     * @param menu
     * @return
     */
    List<Menu> queryMenuByIdList(@Param("id") String menuId, Menu menu);
}