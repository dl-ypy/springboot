package com.ypy.test;

import com.ypy.springboot.mapper.redis.RedisMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisTest {
    @Autowired
    RedisMapper redisMapper;
    @Test
    public void redisTest() {
//        redisMapper.setKey("testName","ypy");
        System.err.println(redisMapper.getValue("testName"));
    }
}
