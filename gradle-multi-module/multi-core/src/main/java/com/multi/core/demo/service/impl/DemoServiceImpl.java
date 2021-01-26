package com.multi.core.demo.service.impl;

import com.multi.pojo.demo.Demo;
import com.multi.core.demo.dao.DemoDao;
import com.multi.core.demo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * projectName : gradle-multi-module
 * className : DemoServiceImpl
 * description :
 * author : wt
 * date : 2021/1/22 15:56
 * version : v2.3
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    private DemoDao demoDao;
    @Override
    public List<Demo> getList() {
        return demoDao.list();
    }
}
