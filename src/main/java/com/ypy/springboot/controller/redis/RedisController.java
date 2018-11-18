package com.ypy.springboot.controller.redis;

import com.ypy.springboot.service.redis.IRedisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
@RequestMapping("redis")
public class RedisController {
    @Resource
    private IRedisService iRedisService;

    @RequestMapping("redisSet")
    public String redisSet() {
        iRedisService.set("redisTest","ypy");
        return "index";
    }

    @RequestMapping("redisGet")
    public String redisGet() {
        String value = (String) iRedisService.get("redisTest");
        System.err.println(value);
        return "index";
    }
}
