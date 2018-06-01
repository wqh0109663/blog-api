package com.hacker.blog.service;

import com.hacker.blog.entity.Blog;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author wqh
 * @date 18-5-30
 */
public interface BlogService {
    /**
     * 获取所有用户博客
     *
     * @return 所有用户博客
     */
    List<Blog> getAllBlog();

    /**
     * 根据博客ID查博客
     *
     * @param blogId 博客ID
     * @return 查到的博客结果
     */
    Blog getBlogById(Integer blogId);

    /**
     * 根据博客ID查博客
     *
     * @param userId 用户ID
     * @param page   页码
     * @param size   一页数据量
     * @return 某一个用户的page页码的博客
     */
    Page<Blog> getBlogByUserId(Long userId, Integer page, Integer size);


    /**
     * 更新博客信息
     *
     * @param blogId 博客ID
     * @param blog   要更新的博客对象
     * @return 更新后的博客
     */
    Blog updateBlogById(Integer blogId, Blog blog);

    /**
     * 根据博客ID删除博客
     *
     * @param blogId 博客ID
     */
    void deleteBlogById(Integer blogId);

    /**
     * 添加新的博客
     *
     * @param userId 用户ID
     * @param blog   添加的博客对象
     * @return 添加后的博客信息
     */
    Blog insertBlogByUserId(Long userId, Blog blog);


}
