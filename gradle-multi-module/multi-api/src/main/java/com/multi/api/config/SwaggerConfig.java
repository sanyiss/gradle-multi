package com.multi.api.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
@ConditionalOnProperty(prefix = "swagger2",value = {"enable"},havingValue = "true")
public class SwaggerConfig {
    /**
     * swagger Demo配置
     * @return 结果集
     */
    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("案例模块接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.multi.api.demo"))
                .paths(PathSelectors.any())
                .build().globalOperationParameters(getPars());
    }

    /**
     * 添加 头信息
     * @return 结果集
     */
    private List<Parameter> getPars(){
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        ticketPar.name("Authorization").description("授权码（token）")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数
        return pars;
    }

    /**
     * swagger 文档描述
     * @return 结果集
     */
    private ApiInfo apiInfo(){
        //作者
        Contact contact = new Contact("multi","","");
        return new ApiInfoBuilder()
                //页面标题
                .title("接口总览")
                //作者
                .contact(contact)
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }

}
