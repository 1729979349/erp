package com.zking.erp.base.exception;

import com.zking.erp.base.utils.JsonResponseBody;
import com.zking.erp.base.utils.ResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringMVC之全局异常处理
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionResolver {

   /* @Override
    public ModelAndView resolveException(HttpServletRequest req,
                                         HttpServletResponse resp,
                                         Object o, Exception ex) {
        String message = null;
        //判断是否是业务类异常或是系统类异常
        if (ex instanceof BusinessException) {
            message = ((BusinessException)ex).getMessage();
        }else{
            message="系统异常";
        }
        return WebUtils.toMessageResult(message,false,"error",req);
    }*/

    /**
     * 处理所有不可知异常
     * @param e 异常
     * @return json结果
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResponseBody<?> handleException(Exception e) {
        // 打印异常堆栈信息
        log.error(e.getMessage(), e);
        return new JsonResponseBody<>(ResponseStatus.UNKNOWN_ERROR);
    }

    /**
     * 处理所有业务异常
     * @param e 业务异常
     * @return json结果
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public JsonResponseBody<?> handleOpdRuntimeException(BusinessException e) {
        // 不打印异常堆栈信息
        log.error(e.getMessage());
        return new JsonResponseBody<>(e.getStatus());
    }
}
