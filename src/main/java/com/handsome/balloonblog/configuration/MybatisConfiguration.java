package com.handsome.balloonblog.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: balloonblog
 * @description: Mybatis配置类
 * @author: handsome
 * @create: 2020-08-05 19:12
 **/
@Configuration
@MapperScan("com.handsome.balloonblog.mbg.mapper")
public class MybatisConfiguration {
}
