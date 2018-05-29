package com.hacker.blog.service;

import com.hacker.blog.entity.Result;
import com.hacker.blog.entity.User;

/**
 * @author wqh
 * @date 18-5-29
 */
public interface UserService {
    /**
     * 根据ID查找用户
     *
     * @param userId 用户ID
     * @return 用户对象
     */
    Result getOneUser(Long userId);

    /**
     * 添加用户
     *
     * @param user 用户对象
     * @return 添加成功的用户对象
     */
    Result addUser(User user);

    /**
     * 查找所有用户
     *
     * @return 用户集合
     */
    Result getAllUser();

    /**
     * 更新用户
     *
     * @param user 用户对象
     * @return 返回更新后的用户对象
     */
    Result updateUser(User user);

    /**
     * 根据ID删除用户
     *
     * @param userId 用户ID
     * @return 空结果
     */
    Result deleteUserById(Long userId);

}
