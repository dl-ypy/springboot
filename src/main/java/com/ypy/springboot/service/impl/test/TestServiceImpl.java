package com.ypy.springboot.service.impl.test;

import com.ypy.springboot.mapper.test.TestMapper;
import com.ypy.springboot.service.test.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TestServiceImpl implements ITestService {
    @Resource
    private TestMapper testMapper;
    @Override
    public List test() {
        return testMapper.test();
    }
}
