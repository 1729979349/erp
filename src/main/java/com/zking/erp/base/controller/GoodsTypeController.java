package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.model.GoodsType;
import com.zking.erp.base.service.IGoodsTypeService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/goodsType")
public class GoodsTypeController {
    @Autowired
    private IGoodsTypeService goodsTypeService;

    /**
     * 分页查询商品类型信息
     * @param goodsType
     * @param req
     * @return
     */
    @RequestMapping("/queryGoodsPagePager")
    @ResponseBody
    public JsonResponseBody queryGoodsPagePager(GoodsType goodsType, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        try {
            return goodsTypeService.queryGoodsPagePager(goodsType, pageBean);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_501);
        }
    }

    /**
     * 删除商品类型信息
     * @param goodsType
     * @param req
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResponseBody<?> delete(GoodsType goodsType,HttpServletRequest req){
        try {
            return goodsTypeService.deleteByPrimaryKey(goodsType.getGoodstypeId());
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_502);
           // throw new RuntimeException(e);
        }
    }

    /**
     * 新增商品类型
     * @param goodsType
     * @param req
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public JsonResponseBody<?> insert(GoodsType goodsType,HttpServletRequest req){
        try {
            return goodsTypeService.insert(goodsType);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseStatus.STATUS_504);
        }
    }

    /**
     * 修改商品类型信息
     * @param goodsType
     * @param req
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public JsonResponseBody<?> update(GoodsType goodsType,HttpServletRequest req){
        try {
            return goodsTypeService.updateByPrimaryKey(goodsType);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_506);
        }
    }


}
