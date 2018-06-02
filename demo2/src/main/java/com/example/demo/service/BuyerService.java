package com.example.demo.service;

import com.example.demo.entity.Buyer;
import com.github.pagehelper.PageInfo;

public interface BuyerService {

    PageInfo<Buyer> queryAllByType(Integer pageNum, Integer pageSize, Integer buytype);

    Integer deleteByPrimaryKey(Integer id);

    Integer insert(Buyer buyer);

    int updateByPrimaryKeySelective(Buyer record);
}
