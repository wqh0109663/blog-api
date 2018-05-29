package com.hacker.blog.controller;

import com.hacker.blog.entity.Result;
import com.hacker.blog.entity.User;
import com.hacker.blog.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wqh
 * @date 18-5-27
 */
@RestController
public class UserController {
    @Resource
    private UserServiceImpl userService;

    /**
     * 查找所有用户信息
     *
     * @return listUsers
     */
    @GetMapping("/users")
    public Result getAllUser() {
        return userService.getAllUser();
    }

    /**
     * 根据id查找用户
     *
     * @param userId 用户id
     * @return user对象
     */
    @GetMapping("/users/{user_id}")
    public Result getOneUser(@PathVariable("user_id") Long userId) {
        return userService.getOneUser(userId);
    }

    /**
     * 更新用户信息
     *
     * @param user 用户
     * @return 返回用户所有信息
     */

    @PutMapping("/users/userInfo")
    public Result updateUser(User user) {
        return userService.updateUser(user);
    }

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 返回用户所有信息
     */
    @PostMapping("/users/newUser")
    public Result addUser(User user) {
        return userService.addUser(user);
    }

    /**
     * 删除一个用户
     *
     * @param userId 用户ID
     */
    @DeleteMapping("/users/{user_id}")
    public Result deleteUserById(@PathVariable("user_id") Long userId) {
        return  userService.deleteUserById(userId);
    }


}
