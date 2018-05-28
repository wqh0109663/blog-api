package com.hacker.blog.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogId;
    @NotNull
    private String  blogTitle;
    @NotNull
    private String  blogText;
    @CreationTimestamp
    private Date blogCreateTime;
    @UpdateTimestamp
    private Date blogUpdateTime;
    private String  blogClassify;
    private String blogKeyword;
    @NotNull
    private Long userId;

}
