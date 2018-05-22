package com.example.demo.service;

import com.example.demo.entity.House;
import com.github.pagehelper.PageInfo;

public interface HouseService {
    PageInfo<House> queryAllByPage(Integer pageNum, Integer pageSize);
}
