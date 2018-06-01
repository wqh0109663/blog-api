package com.hacker.blog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author wqh
 * @date 18-5-27
 */
@Entity
@Data
@ToString
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorityId;
    @Column(nullable = false)
    private String  authorityName;

}
