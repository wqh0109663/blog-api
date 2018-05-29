package com.hacker.blog.utils;


import com.hacker.blog.entity.Result;
import com.hacker.blog.enumeration.ResultEnum;

/**
 * 结果工具类
 *
 * @author wqh
 * @date 18-5-6
 */
public class ResultUtil {
    /**
     * 结果为成功的方法
     *
     * @param object object对象
     * @return result
     */
    public static Result success(Object object) {
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(ResultEnum.OK.getCode());
        objectResult.setMessage(ResultEnum.OK.getMessage());
        objectResult.setData(object);
        return objectResult;
    }

    /**
     * 结果为失败的方法
     *
     * @param errorCode 错误码
     * @param message   错误信息
     * @return result
     */
    public static Result fail(Integer errorCode, String message) {
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(errorCode);
        objectResult.setMessage(message);
        return objectResult;
    }
    public static Result successNoContent() {
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(ResultEnum.OK.getCode());
        objectResult.setMessage(ResultEnum.OK.getMessage());
        return objectResult;
    }

}
