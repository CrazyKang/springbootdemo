package com.boottest.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wangk
 * @Date: 2018/12/17 16:13
 */
@Mapper
public interface TestDao extends BaseMapper {

    List<String> selectTest(Page<String> page);
}
