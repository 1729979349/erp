package com.zking.erp.base.exception;


import com.zking.erp.base.utils.ResponseStatus;

public class BusinessException extends RuntimeException {
    public BusinessException() {
    }
    public BusinessException(String message) {
        super(message);
    }
    private Integer code;
    private String msg;
    private ResponseStatus status;

    public BusinessException(ResponseStatus status) {
        super(status.getMsg());
        this.code=status.getStatus();
        this.msg=status.getMsg();
        this.status=status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }


}
