package com.zhong.test.evndemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/evn")
    public Map getDen() throws UnknownHostException {
        Map res = new HashMap();
        res.put("evn", Inet4Address.getLocalHost().getHostAddress());
        return res;
    }



}
