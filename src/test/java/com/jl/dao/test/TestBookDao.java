package com.jl.dao.test;

import com.jl.bean.Books;
import com.jl.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: springbootDemo
 * @description:
 * @author: LIN
 * @create: 2021~05~14 15:57
 */
@SpringBootTest
public class TestBookDao {
    @Autowired
    private BookDao bookDao;

    @Test
    public void findResfoodByFid(){
        Books b= bookDao.findBook(1);
        System.out.println(b);
    }

}
