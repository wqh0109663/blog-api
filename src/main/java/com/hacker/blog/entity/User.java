package com.hacker.blog.entity;

import com.hacker.blog.enumeration.AuthorityEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author wqh
 * @date 18-5-27
 */
@Entity
@Data
@ToString
@DynamicUpdate
@ApiModel(value = "用户信息")
public class User {
    @ApiModelProperty("用户id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotNull
    @ApiModelProperty("姓名")
    private String userName;
    @NotNull
    @ApiModelProperty("密码")
    private String userPassword;
    @ApiModelProperty("电话")
    private String userTel;
    @ApiModelProperty("邮箱")
    private String userEmail;
    @ApiModelProperty("头像")
    private byte[] userHeadImg;
    @ApiModelProperty("权限")
    private Integer userIdentity = AuthorityEnum.DEFAULT_AUTH.getAuthorityId();
    @CreationTimestamp
    @ApiModelProperty("创建时间")
    private Date userCreateTime;
    @ApiModelProperty("简介")
    private String userInformation;

}
