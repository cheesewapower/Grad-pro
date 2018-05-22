package com.example.demo.service.impl;

import com.example.demo.entity.House;
import com.example.demo.mapper.HouseMapper;
import com.example.demo.service.HouseService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HouseServiceImpl implements HouseService{
    @Autowired
    private HouseMapper houseMapper;

    @Override
    public PageInfo<House> queryAllByPage(Integer pageNum, Integer pageSize){
        PageRowBounds rowBounds=new PageRowBounds((pageNum-1)*pageSize,pageSize);
        PageInfo<House> p=new PageInfo(houseMapper.queryAllByPage(rowBounds));
        return p;
    }
}
