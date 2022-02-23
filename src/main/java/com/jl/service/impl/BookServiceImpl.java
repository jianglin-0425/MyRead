package com.jl.service.impl;

import com.jl.bean.Books;
import com.jl.dao.BookDao;
import com.jl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springbootDemo
 * @description:
 * @author: LIN
 * @create: 2021~05~14 15:23
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public Books findOne(Integer id) {
        return bookDao.findBook(id);
    }
}
