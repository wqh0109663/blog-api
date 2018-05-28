package com.hacker.blog.enumeration;

import lombok.Getter;

/**
 * @author wqh
 * @date 18-5-6
 */
public enum ResultEnum {
    /**
     * 状态码
     */
    OK("OK", 200),
    Created("Created", 201),
    NoContent("No Content", 204),
    PartialContent("Partial Content", 206),
    NotFound("Not Found", 404),
    MethodNotAllowed("Method Not Allowed", 405);
    @Getter
    private String message;
    @Getter
    private Integer code;
    ResultEnum(String message, Integer errorCode) {
        this.message = message;
        this.code = errorCode;
    }
}
