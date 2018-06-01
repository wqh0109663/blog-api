package com.hacker.blog.enumeration;

import lombok.Getter;

/**
 * @author wqh
 * @date 18-5-30
 */


public enum AuthorityEnum {
    HIGH_AUTH(11,"权限高"),
    DEFAULT_AUTH(10,"默认权限"),
    LOWER_AUTH(5,"等级较低")
    ;
    @Getter
    private Integer authorityId;
    @Getter
    private String  authorityName;

    AuthorityEnum(Integer authorityId, String authorityName) {
        this.authorityId = authorityId;
        this.authorityName = authorityName;
    }
}
