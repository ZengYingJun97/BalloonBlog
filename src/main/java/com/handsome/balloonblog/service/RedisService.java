package com.handsome.balloonblog.service;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @program: balloonblog
 * @description: Redis操作服务类
 * @author: handsome
 * @create: 2020-08-08 01:01
 **/
@Service
public class RedisService {

    private static final long WEEK_SECONDS = 60 * 60 * 24 * 7;

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 储存数据，默认过期时间一周
     * @param key 键
     * @param value 值
     */
    public void set(String key, Object value) {
        if (value instanceof String || value instanceof Number) {
            redisTemplate.opsForValue().set(key, String.valueOf(value), WEEK_SECONDS, TimeUnit.SECONDS);
        } else {
            redisTemplate.opsForValue().set(key, JSON.toJSONString(value), WEEK_SECONDS, TimeUnit.SECONDS);
        }
    }

    /**
     * 存储数据
     * @param key 键
     * @param value 值
     * @param expireTime 过期时间
     */
    public void set(String key, Object value, long expireTime) {
        if (value instanceof String || value instanceof Number) {
            redisTemplate.opsForValue().set(key, String.valueOf(value), expireTime, TimeUnit.SECONDS);
        } else {
            redisTemplate.opsForValue().set(key, JSON.toJSONString(value), expireTime, TimeUnit.SECONDS);
        }
    }

    /**
     * 判断是否存在key
     * @param key 键
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 获取对应的数据
     * @param key 键
     * @return
     */
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 获取对应的对象
     * @param key 键
     * @param clazz 目标对象类型
     * @param <T>
     * @return
     */
    public <T> T get(String key, Class<T> clazz) {
        String sValue = get(key);
        if (sValue == null) {
            try {
                Method method = clazz.getMethod("valueOf", new Class[]{String.class});
                return (T) method.invoke(null, new Object[]{"0"});
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return JSON.parseObject(sValue, clazz);
    }

    /**
     * 获取 list 对应 value
     * @param key 键
     * @return
     */
    public List<String> getList(String key) {
        return redisTemplate.opsForList().range(key, 0, -1);
    }

    /**
     * 获取 list 对应 value
     * @param key 键
     * @param l 左范围
     * @param r 右范围
     * @return
     */
    public List<String> getListByRange(String key, long l, long r) {
        return redisTemplate.opsForList().range(key, l, r);
    }

    /**
     * 删除对应的value
     * @param key 键
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    /**
     * 获取 list 对应 value
     * @param key 键
     * @param clazz 目标对象类型
     * @param <T>
     * @return
     */
    public <T> List<T> getList(String key, Class<T> clazz) {
        List<String> jsonList = getList(key);
        List<T> correntList = new ArrayList<>();
        if (jsonList != null) {
            for (String json: jsonList) {
                correntList.add(JSON.parseObject(json, clazz));
            }
            return correntList;
        }
        return null;
    }

    /**
     * 获取 list 对应范围的 value
     * @param key 键
     * @param clazz 目标对象类型
     * @param l 左范围
     * @param r 右范围
     * @param <T>
     * @return
     */
    public <T> List<T> getListByRange(String key, Class<T> clazz, long l, long r) {
        List<String> jsonList = getList(key);
        List<T> correntList = new ArrayList<>();
        if (jsonList != null) {
            for (String json: jsonList) {
                correntList.add(JSON.parseObject(json, clazz));
            }
            return correntList;
        }
        return null;
    }

    /**
     * 获取list的大小
     * @param key 键
     * @return
     */
    public long getListSize(String key) {
        return redisTemplate.opsForList().size(key);
    }

    /**
     * 根据 key 从队头加入元素
     * @param key 键
     * @param value 值
     * @return
     */
    public long lpush(final String key, Object value) {
        final String sValue = JSON.toJSONString(value);
        long result = redisTemplate.execute(new RedisCallback<Long>() {
            @Override
            public Long doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                long count = redisConnection.lPush(serializer.serialize(key), serializer.serialize(sValue));
                return count;
            }
        });
        return result;
    }

    /**
     * 指定缓存失效时间
     * @param key 键
     * @param expireTime 过期时间
     * @return
     */
    public boolean expire(String key, long expireTime) {
        try {
            if (expireTime > 0) {
                redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据 key 从队头加入元素，并设置过期时间
     * @param key 键
     * @param value 值
     * @param expireTime 过期时间
     * @return
     */
    public long lpush(final String key, Object value, long expireTime) {
        long result = lpush(key, value);
        expire(key, expireTime);
        return result;
    }

    /**
     * 根据 key 从队尾加入元素
     * @param key 键
     * @param value 值
     * @return
     */
    public long rpush(final String key, Object value) {
        final String sValue = JSON.toJSONString(value);
        long result = redisTemplate.execute(new RedisCallback<Long>() {
            @Override
            public Long doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                long count = redisConnection.rPush(serializer.serialize(key), serializer.serialize(sValue));
                return count;
            }
        });
        return result;
    }

    /**
     * 根据 key 从队尾加入元素，并设置过期时间
     * @param key 键
     * @param value 值
     * @param expireTime 过期时间
     * @return
     */
    public long rpush(final String key, Object value, long expireTime) {
        long result = rpush(key, value);
        expire(key, expireTime);
        return result;
    }

    /**
     * 依据 key 出队
     * @param key 键
     * @return 值
     */
    public String lpop(final String key) {
        String result = redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] res = redisConnection.lPop(serializer.serialize(key));
                return serializer.deserialize(res);
            }
        });
        return result;
    }

    /**
     * 依据key获取Set的值
     * @param key 键
     * @return
     */
    public Set<String> sGet(String key) {
        try {
            return redisTemplate.opsForSet().members(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 判断value是否在set里面
     * @param key 键
     * @param value 值
     * @return true 存在 false 不存在
     */
    public boolean sHasKey(String key, Object value) {
        try {
            return redisTemplate.opsForSet().isMember(key, value);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 将数据放入set缓存
     * @param key 键
     * @param values 值
     * @return 成功个数
     */
    public long sSet(String key, String... values) {
        try {
            return redisTemplate.opsForSet().add(key, values);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 将set数据放入缓存
     *
     * @param key    键
     * @param time   时间(秒)
     * @param values 值 可以是多个
     * @return 成功个数
     */
    public long sSetAndTime(String key, long time, String... values) {
        try {
            Long count = redisTemplate.opsForSet().add(key, values);
            if (time > 0) expire(key, time);
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 获取set缓存的长度
     *
     * @param key 键
     * @return
     */
    public long sGetSetSize(String key) {
        try {
            return redisTemplate.opsForSet().size(key);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 移除值为value的
     *
     * @param key    键
     * @param values 值 可以是多个
     * @return 移除的个数
     */
    public long setRemove(String key, Object... values) {
        try {
            Long count = redisTemplate.opsForSet().remove(key, values);
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
