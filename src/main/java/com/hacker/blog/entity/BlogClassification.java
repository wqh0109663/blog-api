package com.hacker.blog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author wqh
 * @date 18-5-27
 */
@Entity
@Data
@ToString
public class BlogClassification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer blogClassificationId;
    @NotNull
    private String blogClassificationName;
    @NotNull
    private Long userId;
}
