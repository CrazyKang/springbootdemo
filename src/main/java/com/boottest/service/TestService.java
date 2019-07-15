package com.boottest.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @Author: wangk
 * @Date: 2018/12/17 15:48
 */
public interface TestService {

    String demo(Page<String> page);

}
