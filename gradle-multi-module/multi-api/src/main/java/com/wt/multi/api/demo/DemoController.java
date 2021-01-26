package com.wt.multi.api.demo;

import com.wt.multi.pojo.demo.Demo;
import com.wt.multi.core.demo.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * projectName : gradle-multi-module
 * className : DemoController
 * description :
 * author : wt
 * date : 2021/1/22 14:45
 * version : v2.3
 */
@RestController
@RequestMapping("/demo")
@Api(value = "案例API", tags = "案例API")
public class DemoController {

    @PostMapping("/demo")
    @ApiOperation(value = "案例一集合", notes = "案例一集合")
    @ResponseBody
    public List<Demo> demo() {
        return Stream.of(Demo.builder().pkId(1).name("demo").build()).collect(Collectors.toList());
    }

    @Resource
    private DemoService demoService;
    @PostMapping("/demo2")
    @ApiOperation(value = "案例二集合", notes = "案例二集合")
    @ResponseBody
    public List<Demo> demo2() {
        return demoService.getList();
    }
}
