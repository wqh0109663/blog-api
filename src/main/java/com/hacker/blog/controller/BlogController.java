package com.hacker.blog.controller;

import com.hacker.blog.entity.Blog;
import com.hacker.blog.result.Result;
import com.hacker.blog.service.impl.BlogServiceImpl;
import com.hacker.blog.utils.ResultUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wqh
 * @date 18-5-30
 */

@RestController
public class BlogController {
    @Resource
    private BlogServiceImpl blogService;

    @ApiOperation(value = "get所有博客", notes = "查找所有博客")
    @GetMapping("/blogs")
    public Result getAllBlog() {
        return ResultUtil.success(blogService.getAllBlog());
    }

    @ApiOperation(value = "get查找用户的某一个博客", notes = "根据博客ID查找博客")
    @GetMapping("/blog/{blog_id}")
    public Result getBlogById(@PathVariable("blog_id") Integer blogId) {
        return ResultUtil.success(blogService.getBlogById(blogId));
    }

    @ApiOperation(value = "get查找某一用户的所有博客", notes = "查找用户的所有博客")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user_id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "size", value = "一页的数目", required = true, dataType = "Integer")
    })
    @GetMapping("/pageUserBlog/{user_id}")
    public Result getBlogByUserId(@PathVariable("user_id") Long userId, @RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        return ResultUtil.success(blogService.getBlogByUserId(userId, page, size));
    }
    @ApiOperation(value = "put更新用户博客", notes = "更新用户博客")
    @PutMapping("blog/{blog_id}")
    public Result updateBlogById(@PathVariable("blog_id") Integer blogId, Blog blog) {
        return ResultUtil.success(blogService.updateBlogById(blogId, blog));
    }
    @ApiOperation(value = "delete删除用户博客", notes = "删除用户博客")
    @DeleteMapping("/blog/{blog_id}")
    public Result deleteBlogById(@PathVariable("blog_id") Integer blogId) {
        blogService.deleteBlogById(blogId);
        return ResultUtil.successNoContent();
    }
    @ApiOperation(value = "post添加用户博客", notes = "添加用户博客")
    @PostMapping("/blog")
    public Result insertBlogByUserId(@RequestParam("userId") Long userId, Blog blog) {
        return ResultUtil.success(blogService.insertBlogByUserId(userId, blog));
    }

}
