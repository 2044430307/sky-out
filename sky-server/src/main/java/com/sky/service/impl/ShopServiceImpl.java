package com.sky.service.impl;

import com.sky.result.Result;
import com.sky.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private RedisTemplate stringRedisTemplate;

    public static final String KEY = "SHOP_STATUS";


    @Override
    public Result setStatus(String status) {
        stringRedisTemplate.opsForValue().set(KEY,status);
        return Result.success();
    }

    @Override
    public Result getStatus() {
        String shop =(String) stringRedisTemplate.opsForValue().get(KEY);
        return Result.success(shop);
    }
}
