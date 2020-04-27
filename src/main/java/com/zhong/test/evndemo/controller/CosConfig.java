package com.zhong.test.evndemo.controller;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(TestConfig.class)
public class CosConfig {

    @Resource
    private TestConfig c;

    public String getevn() {
        return c.getUrl();
    }

}
