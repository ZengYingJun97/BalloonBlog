package com.handsome.balloonblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @program: balloonblog
 * @description: Redis操作服务类
 * @author: handsome
 * @create: 2020-08-08 01:01
 **/
public class RedisService {

    private static final long WEEK_SECONDS = 60 * 60 * 24 * 7;

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 储存数据
     * @param key 键
     * @param value 值
     */
    public void set(String key, Object value) {
        if (value instanceof String || value instanceof Number) {
            redisTemplate.opsForValue().set(key, String.valueOf(value), WEEK_SECONDS, TimeUnit.SECONDS);
        } else {
        }
    }

    /**
     * 获取数据
     * @param key 键
     * @return 值
     */
    String get(String key);

    /**
     * 设置过期时间
     * @param key 键
     * @param expire 过期时间
     * @return 是否成功
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     * @param key
     */
    void remove(String key);

    /**
     *
     * @param key
     * @param dalta
     * @return
     */
    Long increment(String key, long dalta);
}
