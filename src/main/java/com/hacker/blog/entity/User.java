package com.hacker.blog.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotNull
    private String userName;
    @NotNull
    private String userPassword;
    private String userTel;
    private String userEmail;
    private byte[] userHeadImg;
    private Integer userIdentity;
    @CreationTimestamp
    private Date userCreateTime;
    private String userInformation;

}
