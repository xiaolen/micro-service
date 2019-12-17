package com.microconfigclient.microconfigclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiaolen
 * @Date: 2019/11/14 0:28
 * @Version 1.0
 */

@RestController
public class ConfigController {

//    @Value("${foo}")
//    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
//        return foo;
        return null;
    }

}
