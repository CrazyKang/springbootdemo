package com.boottest.serviceimpl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boottest.dao.test1.T1dao;
import com.boottest.dao.test2.T2dao;
import com.boottest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangk
 * @Date: 2018/12/17 15:49
 */
@Service
public class TestServiceImpl implements TestService {

//    @Autowired
//    TestDao testDao;

    @Autowired
    T1dao t1dao;

    @Autowired
    T2dao t2dao;


    @Override
    public String demo(Page<String> page) {
//        List<String> names = testDao.selectTest(page);
//        page.setRecords(names);
//        System.out.println(page);

        try {
            String s1 = t1dao.selectname();
            String s2 = t2dao.selectname();
            System.out.println(s1);
            System.out.println(s2);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

        return null;
    }
}
