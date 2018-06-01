package com.example.demo.service.impl;

import com.example.demo.entity.Buyer;
import com.example.demo.mapper.BuyerMapper;
import com.example.demo.service.BuyerService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerMapper buyerMapper;
    @Override
    public PageInfo<Buyer> queryAllByType(Integer pageNum, Integer pageSize, Integer buytype) {
        PageRowBounds rowBounds=new PageRowBounds((pageNum-1)*pageSize,pageSize);
        PageInfo<Buyer> p=new PageInfo(buyerMapper.queryAllByType(rowBounds,buytype));
        return p;
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return buyerMapper.deleteByPrimaryKey(id);
    }
}
