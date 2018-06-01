package com.hacker.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
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
@DynamicUpdate
@ApiModel(value = "博客信息")
public class Blog {
    @Id
    @ApiModelProperty("博客ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogId;
    @ApiModelProperty("博客标题")
    private String  blogTitle;
    @NotNull
    @ApiModelProperty("博客内容")
    private String  blogText;
    @CreationTimestamp
    @ApiModelProperty("博客创建时间")
    private Date blogCreateTime;
    @UpdateTimestamp
    @ApiModelProperty("博客更新时间")
    private Date blogUpdateTime;
    @ApiModelProperty("博客分类")
    private String  blogClassify;
    @ApiModelProperty("博客关键字")
    private String blogKeyword;
    @NotNull
    @ApiModelProperty("用户ID")
    private Long userId;

}
