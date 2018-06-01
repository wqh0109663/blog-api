package com.hacker.blog.repository;

import com.hacker.blog.entity.Blog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author wqh
 * @date 18-5-30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogRepositoryTest {

    @Resource
    private BlogRepository blogRepository;

    @Test
    public void findBlogsByUserIdTest() {
        PageRequest request = PageRequest.of(0, 3);
        Page<Blog> blogsByUserId = blogRepository.findBlogsByUserId(1L, request);
        Assert.assertNotEquals(0,blogsByUserId.getTotalElements());
    }
    @Test
    @Transactional
    public void updateBlogTest(){
        int i = blogRepository.updateBlog(1, "文章标题", "计算机可续",
                "我是文章内容", "关键字");
        Assert.assertSame(1,i);


    }
}