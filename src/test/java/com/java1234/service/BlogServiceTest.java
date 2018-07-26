package com.java1234.service;

import com.java1234.entity.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BlogServiceTest {

    @Resource
    private BlogService blogService;
    @Test
    public void countList() throws Exception {
        List<Blog> blogs = blogService.countList();
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}