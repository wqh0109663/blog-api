package com.hacker.blog.service.impl;

import com.hacker.blog.entity.Blog;
import com.hacker.blog.repository.BlogRepository;
import com.hacker.blog.service.BlogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author wqh
 * @date 18-5-30
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogRepository blogRepository;

    @Override
    public List<Blog> getAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(Integer blogId) {
        return blogRepository.findById(blogId).get();
    }

    @Override
    public Page<Blog> getBlogByUserId(Long userId, Integer page, Integer size) {
        return blogRepository.findBlogsByUserId(userId, PageRequest.of(page, size));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Blog updateBlogById(Integer blogId, Blog blog) {
        String blogClassify = blog.getBlogClassify();
        String blogKeyword = blog.getBlogKeyword();
        @NotNull String blogText = blog.getBlogText();
        String blogTitle = blog.getBlogTitle();
        int i = blogRepository.updateBlog(blogId, blogTitle, blogClassify, blogText, blogKeyword);
        if (i>0){
            return blogRepository.findById(blogId).get();
        }
        return null;
    }

    @Override
    public void deleteBlogById(Integer blogId) {
        blogRepository.deleteById(blogId);
    }

    @Override
    public Blog insertBlogByUserId(Long userId, Blog blog) {
        blog.setUserId(userId);
        return blogRepository.saveAndFlush(blog);
    }
}
