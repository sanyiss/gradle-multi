package com.multi.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement(proxyTargetClass = true)
//扫描mybatis 接口
@MapperScan(basePackages = {"com.multi.core.*.dao"})
//扫描 springboot 注解
@ComponentScan(basePackages = "com.multi.*")
@EnableCaching
@EnableScheduling
public class ApiApplication {
	/**
	 * main方法
	 * @param args args
	 */
	public static void main(String[] args) {
      SpringApplication.run(ApiApplication.class, args);
	}
}