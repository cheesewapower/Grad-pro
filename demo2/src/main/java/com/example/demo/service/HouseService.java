package com.example.demo.service;

import com.example.demo.entity.House;
import com.github.pagehelper.PageInfo;

public interface HouseService {
    PageInfo<House> queryAllByPage(Integer pageNum, Integer pageSize);

    PageInfo<House> querySellingByPage(Integer pageNum, Integer pageSize);

    PageInfo<House> querySoldByPage(Integer pageNum, Integer pageSize);

    PageInfo<House> searchSellingHouse(Integer pageNum, Integer pageSize,String keyword);

    Integer deleteByPrimaryKey(Integer id);

    void checkOutById(Integer id);

    void checkOutById2(Integer id);
}
