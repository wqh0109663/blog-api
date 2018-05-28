package com.hacker.blog.repository;

import com.hacker.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author wqh
 * @date 18-5-27
 */
public interface UserRepository extends JpaRepository<User,Long>,
        JpaSpecificationExecutor<User>,Serializable {


}
