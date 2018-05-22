package com.example.demo.service.impl;

import com.example.demo.entity.Staff;
import com.example.demo.mapper.StaffMapper;
import com.example.demo.service.StaffService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StaffServiceImpl implements StaffService{
    @Autowired
    private StaffMapper staffMapper;

    @Override
    public Staff selectByPrimaryKey(Integer id) {
        return staffMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<Staff> queryAllByPage(Integer pageNum, Integer pageSize){
        PageRowBounds rowBounds=new PageRowBounds((pageNum-1)*pageSize,pageSize);
        PageInfo<Staff> p=new PageInfo(staffMapper.queryAllByPage(rowBounds));
        return p;
    }

}
