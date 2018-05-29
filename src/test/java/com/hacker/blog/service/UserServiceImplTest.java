package com.hacker.blog.service;

import com.hacker.blog.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @author wqh
 * @date 18-5-29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Resource
    private UserRepository userRepository;

    @Test
    public void getOneUser() {

    }

    @Test
    public void addUser() {

    }

    @Test
    public void getAllUser() {

    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUserById() {
    }
}