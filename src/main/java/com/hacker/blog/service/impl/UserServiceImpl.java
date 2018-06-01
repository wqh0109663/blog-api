package com.hacker.blog.service.impl;


import com.hacker.blog.result.Result;
import com.hacker.blog.entity.User;
import com.hacker.blog.repository.UserRepository;
import com.hacker.blog.service.UserService;
import com.hacker.blog.utils.ResultUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wqh
 * @date 18-5-6
 */

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;


    @Override
    public User getOneUser(Long userId) {
        return userRepository.findById(userId).get();
    }


    @Override
    public User addUser(User user) {
      return   userRepository.saveAndFlush(user);
    }


    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }


    @Override
    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }


    @Override
    public Result deleteUserById(Long userId) {
        userRepository.deleteById(userId);
        return ResultUtil.successNoContent();
    }


}
