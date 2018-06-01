package com.hacker.blog.controller;

import com.hacker.blog.entity.User;
import com.hacker.blog.result.Result;
import com.hacker.blog.service.impl.UserServiceImpl;
import com.hacker.blog.utils.ResultUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value = "get查找所有用户信息", notes = "查找所有用户信息")
    @GetMapping("/users")
    public Result getAllUser() {
        return ResultUtil.success(userService.getAllUser());
    }

    /**
     * 根据id查找用户
     *
     * @param userId 用户id
     * @return user对象
     */
    @ApiOperation(value = "get查找某一用户", notes = "根据id查询用户")
    @GetMapping("/users/{user_id}")
    public Result getOneUser(@PathVariable("user_id") Long userId) {
        return ResultUtil.success(userService.getOneUser(userId));
    }

    /**
     * 更新用户信息
     *
     * @param user 用户
     * @return 返回用户所有信息
     */
    @ApiOperation(value = "put更新用户", notes = "更新用户信息")
    @PutMapping("/users/userInfo")
    public Result updateUser(User user) {
        return ResultUtil.success(userService.updateUser(user));
    }

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 返回用户所有信息
     */
    @ApiOperation(value = "post请求添加用户", notes = "添加用户")
    @PostMapping("/users/newUser")
    public Result addUser(User user) {
        return ResultUtil.success(userService.addUser(user));
    }

    /**
     * 删除一个用户
     *
     * @param userId 用户ID
     */
    @ApiOperation(value = "delete删除用户", notes = "根据id删除用户")
    @ApiImplicitParam(name = "user_id", value = "用户ID", required = true, dataType = "Long")
    @DeleteMapping("/users/{user_id}")
    public Result deleteUserById(@PathVariable("user_id") Long userId) {
        return userService.deleteUserById(userId);
    }
}
