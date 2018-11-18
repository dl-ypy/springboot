package com.ypy.springboot.controller.test;

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

    @RequestMapping("test")
    public String test() {
        List list = testService.test();
        System.err.println(list);
        return "index";
    }
}
