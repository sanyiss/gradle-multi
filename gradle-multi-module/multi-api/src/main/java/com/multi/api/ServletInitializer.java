package com.multi.api;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * springBoot war 部署
 */
@ServletComponentScan
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * 配置启动类
	 * @param application SpringApplicationBuilder 对象
	 * @return  SpringApplicationBuilder 对象
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiApplication.class);
	}

}
