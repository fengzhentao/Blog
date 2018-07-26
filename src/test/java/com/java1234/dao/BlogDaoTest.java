package com.java1234.dao;

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
public class BlogDaoTest {

    @Resource
    private BlogDao blogDao;
    @Test
    public void countList() throws Exception {
        List<Blog> list = blogDao.countList();
        for (Blog blog : list) {
            System.out.println(blog);
        }
    }

    @org.junit.Test
    public void list() throws Exception {

    }

    @org.junit.Test
    public void getTotal() throws Exception {

    }

    @org.junit.Test
    public void findById() throws Exception {

    }

    @org.junit.Test
    public void update() throws Exception {

    }

    @org.junit.Test
    public void getLastBlog() throws Exception {

    }

    @org.junit.Test
    public void getNextBlog() throws Exception {

    }

    @org.junit.Test
    public void add() throws Exception {

    }

    @org.junit.Test
    public void delete() throws Exception {

    }

    @org.junit.Test
    public void getBlogByTypeId() throws Exception {

    }
}