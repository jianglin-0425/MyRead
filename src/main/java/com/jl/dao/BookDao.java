package com.jl.dao;

import com.jl.bean.Books;

/**
 * @program: springbootDemo
 * @description:
 * @author: LIN
 * @create: 2021~05~14 15:14
 */
public interface BookDao {

    Books findBook(Integer id);
}
