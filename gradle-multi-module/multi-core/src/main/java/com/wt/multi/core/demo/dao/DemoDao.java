package com.wt.multi.core.demo.dao;


import com.wt.multi.pojo.demo.Demo;

import java.util.List;

/**
 * projectName : gradle-multi-module
 * className : DemoDao
 * description :
 * author : wt
 * date : 2021/1/22 16:21
 * version : v2.3
 */
public interface DemoDao {
    List<Demo> list();
}
