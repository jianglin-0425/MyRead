package com.jl.controller;


import com.jl.bean.Books;
import com.jl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: ssm
 * @description:
 * @author: LIN
 * @create: 2021~05~12 23:51
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/allbook")
    public @ResponseBody Books list(Model model){
        Books list=bookService.findOne(1);
        System.out.println(list);
        model.addAttribute("list",list);
        return  list;
    }
    @RequestMapping("/showOne")
    @ResponseBody
    public Books toIndex(HttpServletRequest request, Model model){
        Books user = this.bookService.findOne(1);
        return user;
    }




}
