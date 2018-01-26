package com.example;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by user12 on 2018/1/26.
 */

@Component
public class TestHealth implements HealthIndicator{
    @Override
    public Health health() {  //在里面实现自己的监控逻辑
        return Health.up().withDetail("测试线程数",100).build();
    }
}
