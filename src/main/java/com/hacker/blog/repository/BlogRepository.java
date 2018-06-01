package com.hacker.blog.repository;

import com.hacker.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author wqh
 * @date 18-5-30
 */
public interface BlogRepository extends JpaRepository<Blog, Integer>, JpaSpecificationExecutor<Blog> {
    /**
     * 根据用户ID查找博客
     *
     * @param userId   用户ID
     * @param pageable 接口
     * @return page对象
     */
    Page<Blog> findBlogsByUserId(Long userId, Pageable pageable);

    /**
     * 根据博客ID更新博客
     * @param blogId 博客ID
     * @param blogTitle 博客标题
     * @param blogClassify 博客分类
     * @param blogText 博客内容
     * @param blogKeyword 博客关键字
     * @return 影响的行数
     */
    @Modifying
    @Query("update Blog b set b.blogTitle = ?2 ," +
            "b.blogClassify= ?3,b.blogText = ?4,b.blogKeyword = ?5 where b.blogId = ?1")
    int updateBlog(Integer blogId,String blogTitle,
                    String blogClassify,String blogText,String blogKeyword);


}
