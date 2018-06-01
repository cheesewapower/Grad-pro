package com.example.demo.mapper;

import com.example.demo.entity.Buyer;
import com.example.demo.entity.BuyerExample;
import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BuyerMapper {
    int countByExample(BuyerExample example);

    int deleteByExample(BuyerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    List<Buyer> selectByExample(BuyerExample example);

    Buyer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Buyer record, @Param("example") BuyerExample example);

    int updateByExample(@Param("record") Buyer record, @Param("example") BuyerExample example);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);

    List<Buyer> queryAllByType(@Param("rowBounds") RowBounds rowBounds, @Param("buytype")Integer buytype);

}