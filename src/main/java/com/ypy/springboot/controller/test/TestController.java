package com.ypy.springboot.controller.test;

import com.ypy.springboot.service.redis.IRedisService;
import com.ypy.springboot.service.test.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    private ITestService testService;
    @Resource
    private IRedisService iRedisService;

    @RequestMapping("test")
    public String test() {
        List list = testService.test();
        System.err.println(list);
        return "index";
    }

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
