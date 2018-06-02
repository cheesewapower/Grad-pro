package com.example.demo.mapper;

import com.example.demo.dto.Calcu;
import com.example.demo.entity.House;
import com.example.demo.entity.HouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HouseMapper {
    int countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(Integer id);

    void checkOutById(Integer id);
    //两个sql语句
    void checkOutById2(Integer id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    List<House> queryAllByPage(@Param("rowBounds") RowBounds rowBounds);

    List<House> querySellingByPage(@Param("rowBounds") RowBounds rowBounds);

    List<House> querySoldByPage(@Param("rowBounds") RowBounds rowBounds);



    List<House> searchSellingHouse(@Param("rowBounds") RowBounds rowBounds,@Param("keyword")String keyword);

    Calcu statistics(@Param("startDate")String startDate, @Param("endDate")String endDate);


}