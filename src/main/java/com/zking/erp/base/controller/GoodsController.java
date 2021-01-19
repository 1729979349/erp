package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.model.Goods;
import com.zking.erp.base.service.IGoodsService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    /**
     * 分页查询商品信息
     * @param goods
     * @param req
     * @return
     */
    @RequestMapping("/queryGoodsPager")
    @ResponseBody
    public JsonResponseBody queryGoodsPager(Goods goods, HttpServletRequest req){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        try {
            return goodsService.queryGoodsPager(goods, pageBean);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_501);
        }
    }

    /**
     * 删除商品类型信息
     * @param goods
     * @param req
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResponseBody<?> delete(Goods goods,HttpServletRequest req){
        try {
            return goodsService.deleteByPrimaryKey(goods.getGoodsId());
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_502);
        }
    }

    /**
     * 新增商品
     * @param goods
     * @param req
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public JsonResponseBody<?> insert(Goods goods,HttpServletRequest req){
        try {
            return goodsService.insert(goods);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(ResponseStatus.STATUS_504);
        }
    }

    /**
     * 修改商品类型信息
     * @param goods
     * @param req
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public JsonResponseBody<?> update(Goods goods,HttpServletRequest req){
        try {
            System.out.println("修改信息"+goods);
            return goodsService.updateByPrimaryKey(goods);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_506);
        }
    }

}
