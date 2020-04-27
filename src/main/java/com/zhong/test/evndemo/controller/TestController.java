package com.zhong.test.evndemo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/evn")
    public Map getDen() {

        Map res = new HashMap();
        res.put("evn", "");
        return res;
    }



}
