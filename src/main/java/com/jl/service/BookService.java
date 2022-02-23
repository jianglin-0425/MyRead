package com.jl.service;

import com.jl.bean.Books;

/**
 * @program: springbootDemo
 * @description:
 * @author: LIN
 * @create: 2021~05~14 15:22
 */
public interface BookService {
    public Books findOne(Integer id);
}
