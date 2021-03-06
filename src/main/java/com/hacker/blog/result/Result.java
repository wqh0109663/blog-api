package com.hacker.blog.result;


import lombok.Data;
import lombok.ToString;

/**
 * http返回格式
 *
 * @author wqh
 * @date 18-5-6
 */
@Data
@ToString
public class Result<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 具体内容
     */
    private T data;

}
