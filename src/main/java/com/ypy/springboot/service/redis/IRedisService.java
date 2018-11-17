package com.ypy.springboot.service.redis;

public interface IRedisService {
    void set(String key, Object value);
    Object get(String key);
}
