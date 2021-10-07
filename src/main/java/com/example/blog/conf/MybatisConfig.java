package com.example.blog.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.example.blog.mappers"})
public class MybatisConfig {
}
