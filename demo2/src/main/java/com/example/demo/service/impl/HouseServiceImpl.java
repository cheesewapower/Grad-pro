package com.example.demo.service.impl;

import com.example.demo.dto.Calcu;
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

    @Override
    public PageInfo<House> querySellingByPage(Integer pageNum, Integer pageSize) {
        PageRowBounds rowBounds=new PageRowBounds((pageNum-1)*pageSize,pageSize);
        PageInfo<House> p=new PageInfo(houseMapper.querySellingByPage(rowBounds));
        return p;
    }

    @Override
    public PageInfo<House> querySoldByPage(Integer pageNum, Integer pageSize) {
        PageRowBounds rowBounds=new PageRowBounds((pageNum-1)*pageSize,pageSize);
        PageInfo<House> p=new PageInfo(houseMapper.querySoldByPage(rowBounds));
        return p;
    }

    @Override
    public PageInfo<House> searchSellingHouse(Integer pageNum, Integer pageSize, String keyword) {
        PageRowBounds rowBounds=new PageRowBounds((pageNum-1)*pageSize,pageSize);
        PageInfo<House> p=new PageInfo(houseMapper.searchSellingHouse(rowBounds,keyword));
        return p;
    }


    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return houseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void checkOutById(Integer id) {
         houseMapper.checkOutById(id);
    }

    @Override
    public void checkOutById2(Integer id) {
         houseMapper.checkOutById2(id);
    }

    @Override
    public Calcu statistics(String startDate, String endDate) {
        return houseMapper.statistics(startDate,endDate);
    }

}
