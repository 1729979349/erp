package com.zking.erp.base.utils;

/**
 * 用于数据接口返回的状态码枚举
 */
public enum ResponseStatus {

    STATUS_200(200,"OK"),
    STATUS_201(201,"保存数据失败！"),
    STATUS_202(202,"查无数据！"),
    STATUS_203(203,"删除数据失败！"),
    STATUS_204(204,"查询数据失败！"),
    STATUS_205(205,"登录身份过期，请重新登录！"),
    STATUS_206(206,"Token令牌失效或已过期！"),
    STATUS_207(207,"权限不足，当前请求无效！"),
    STATUS_208(208,"运行时异常"),
    UNKNOWN_ERROR(999, "未知错误"),

    //部门管理
    STATUS_251(251,"新增部门信息失败！"),
    STATUS_252(252,"名称不可重复！"),
    STATUS_253(253,"新增部门信息成功！"),

    STATUS_254(254,"删除部门信息失败！"),
    STATUS_255(255,"删除部门信息成功！"),
    STATUS_256(256,"修改部门信息失败！"),
    STATUS_257(257,"修改部门信息成功！"),
    STATUS_258(258,"查询数据失败！"),
    STATUS_259(259,"查询数据成功！"),

    //员工管理
    STATUS_261(261,"新增员工信息失败！"),
    STATUS_262(262,"登录名不可重复！"),
    STATUS_263(263,"新增员工信息成功！"),

    STATUS_264(264,"删除员工信息失败！"),
    STATUS_265(265,"删除员工信息成功！"),
    STATUS_266(266,"修改员工信息失败！"),
    STATUS_267(267,"修改员工信息成功！"),
    STATUS_268(268,"查询数据失败！"),
    STATUS_269(269,"查询数据成功！"),
    //基本信息管理
    STATUS_501(501,"查无此据！"),
    STATUS_502(502,"删除数据失败！"),
    STATUS_503(503,"删除数据成功！"),
    STATUS_504(504,"新增数据失败！"),
    STATUS_505(505,"新增数据成功！"),
    STATUS_506(506,"修改数据失败！"),
    STATUS_507(507,"修改数据成功！"),
    STATUS_508(508,"新增数据名称不能重复！"),
    STATUS_509(509,"修改数据名称不能重复！"),
    STATUS_1000(1000,"盘盈盘亏审核失败！"),
    ;

    private Integer status;
    private String msg;

    ResponseStatus(Integer status, String msg) {
        this.status=status;
        this.msg=msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
