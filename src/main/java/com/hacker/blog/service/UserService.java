package com.hacker.blog.service;


import com.hacker.blog.entity.Result;
import com.hacker.blog.entity.User;
import com.hacker.blog.repository.UserRepository;
import com.hacker.blog.utils.ResultUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wqh
 * @date 18-5-6
 */

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;


    /**
     * 根据ID查找用户
     *
     * @param userId 用户ID
     * @return 用户对象
     */
    public Result getOneUser(Long userId) {
        return ResultUtil.success(userRepository.findById(userId).get());
    }

    /**
     * 添加用户
     *
     * @param user 用户对象
     * @return 添加成功的用户对象
     */
    public Result addUser(User user) {
        userRepository.saveAndFlush(user);
        return ResultUtil.success(user);
    }

    /**
     * 查找所有用户
     *
     * @return 用户集合
     */
    public Result getAllUser() {
        return ResultUtil.success(userRepository.findAll());
    }

    /**
     * 更新用户
     *
     * @param user 用户对象
     * @return 返回更新后的用户对象
     */
    public Result updateUser(User user) {
        return ResultUtil.success(user);
    }

    /**
     * 根据ID删除一个用户
     *
     * @param userId 用户ID
     */
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }


}
