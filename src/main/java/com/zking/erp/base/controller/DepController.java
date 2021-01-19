package com.zking.erp.base.controller;

import com.zking.erp.base.exception.BusinessException;
import com.zking.erp.base.model.Dep;
import com.zking.erp.base.service.IDepService;
import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.PageBean;
import com.zking.erp.base.utils.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/dep")
public class DepController {

	@Autowired
	private IDepService depService;

	/**
	 * 新增部门信息
	 * @param dep
	 * @param req
	 * @return
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public JsonResponseBody<?> insert(Dep dep,HttpServletRequest req){
		try {
			return depService.insert(dep);
		} catch (Exception e) {
			//throw new BusinessException("新增部门信息失败！");
			throw new RuntimeException(e);
		}
	}

	/**
	 * 删除部门信息
	 * @param dep
	 * @param req
	 * @return
	 */
	@RequestMapping("/deleteByPrimaryKey")
	@ResponseBody
	public JsonResponseBody<?> deleteByPrimaryKey(Dep dep,HttpServletRequest req){
		try {
			return depService.deleteByPrimaryKey(dep.getDepId());
		} catch (Exception e) {
			//throw new BusinessException("删除部门信息失败！");
			throw new RuntimeException(e);
		}
	}

	/**
	 * 修改部门信息
	 * @param dep
	 * @param req
	 * @return
	 */
	@RequestMapping("/updateByPrimaryKey")
	@ResponseBody
	public JsonResponseBody<?> updateByPrimaryKey(Dep dep,HttpServletRequest req){
		try {
			return depService.updateByPrimaryKey(dep);
		} catch (Exception e) {
			//throw new BusinessException("修改部门信息失败！");
			throw new RuntimeException(e);
		}
	}

	/**
	 * 分页查询部门管理信息
	 * @param dep
	 * @param req
	 * @return
	 */
	@RequestMapping("/queryDepPager")
	@ResponseBody
	public JsonResponseBody queryDepPager(Dep dep, HttpServletRequest req){
		try {
			PageBean pageBean=new PageBean();
			pageBean.setRequest(req);
			return depService.queryDepPager(dep,pageBean);
		} catch (Exception e) {
			throw new BusinessException(ResponseStatus.STATUS_204);
		}
	}

	/**
	 * 根据名称查询单个
	 * @param DepName
	 * @param req
	 * @return
	 */
	@RequestMapping("/selectDepByName")
	@ResponseBody
	public JsonResponseBody selectDepByName(String DepName, HttpServletRequest req){
		try {
			return depService.selectDepByName(DepName);
		} catch (Exception e) {
			throw new BusinessException(ResponseStatus.STATUS_204);
		}
	}




}
