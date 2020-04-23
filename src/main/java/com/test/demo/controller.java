package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lijianhua
 * @Date: 2020/4/23 0023 14:47
 * @description
 */



@RestController
public class controller {

    @GetMapping("/test")
    public  String test(){
        return "这是一个测试  没有修改";

    }


}
