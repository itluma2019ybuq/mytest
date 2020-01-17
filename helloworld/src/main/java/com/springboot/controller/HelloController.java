package com.springboot.controller;

import com.springboot.mapper.EmpMapper;
import com.springboot.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 飞鸟
 * @create 2020-01-09 9:50
 */
@Controller
public class HelloController {

    @Autowired
    private EmpMapper empMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }


    @RequestMapping("/list")
    @ResponseBody
    public List<Emp> list(){
        return empMapper.list();
    }


}
