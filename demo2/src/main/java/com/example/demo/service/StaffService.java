package com.example.demo.service;

import com.example.demo.entity.Staff;
import com.github.pagehelper.PageInfo;



public interface StaffService {
    Staff selectByPrimaryKey(Integer id);

    PageInfo<Staff> queryAllByPage(Integer pageNum, Integer pageSize);

    Integer insertSelective(Staff record);

    Integer deleteByPrimaryKey(Integer id);
}
