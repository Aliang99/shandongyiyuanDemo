package com.yiyuan.ExceptionHandler;

import com.yiyuan.Exception.MyParamException;
import com.yiyuan.vo.ResultVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 集中处理异常
 */
@ControllerAdvice
public class MyParamExceptionHandler {

    /**
     * 参数异常的处理
     * @param ex
     * @return
     */
    @ExceptionHandler({MyParamException.class})
    @ResponseBody
    public ResultVo paramEx(Exception ex){
        return new ResultVo(ex.getMessage(),500);
    }

    /**
     * 其它异常的处理
     * @param ex
     * @return
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResultVo Ex(Exception ex){
        return new ResultVo("服务器发生错误，请稍后再试",500);
    }
}
