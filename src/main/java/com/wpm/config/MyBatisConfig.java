package com.wpm.config;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "com.wpm.modules.*.mapper")
public class MyBatisConfig {

}
