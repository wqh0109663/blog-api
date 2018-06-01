package com.hacker.blog.repository;

import com.hacker.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wqh
 * @date 18-5-27
 */
public interface UserRepository extends JpaRepository<User,Long>{


}
