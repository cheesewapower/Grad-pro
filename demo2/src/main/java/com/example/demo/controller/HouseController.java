package com.example.demo.controller;

import com.example.demo.entity.House;
import com.example.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/house")
public class HouseController {
    @Autowired
    HouseService houseService;

    @GetMapping(value = "/findAllByPage")
    public Object findAllByPage(@RequestParam("pageNum") int pageNum,
                                @RequestParam("pageSize") int pageSize){
        return houseService.queryAllByPage(pageNum,pageSize);
    }
    @GetMapping(value = "/querySellingByPage")
    public Object querySellingByPage(@RequestParam("pageNum") int pageNum,
                                @RequestParam("pageSize") int pageSize){
        return houseService.querySellingByPage(pageNum,pageSize);
    }
    @GetMapping(value = "/querySoldByPage")
    public Object querySoldByPage(@RequestParam("pageNum") int pageNum,
                                     @RequestParam("pageSize") int pageSize){
        return houseService.querySoldByPage(pageNum,pageSize);
    }




    @GetMapping(value = "/searchSellingHouse")
    public Object searchSellingHouse(@RequestParam("pageNum") int pageNum,
                                     @RequestParam("pageSize") int pageSize,
                                     @RequestParam("keyword")  String keyword){
        return houseService.searchSellingHouse(pageNum,pageSize,keyword);
    }

    @DeleteMapping(value = "/deleteByPrimaryKey")
    public Integer deleteByPrimaryKey(@RequestParam(name = "id", required = false) int id){
        return houseService.deleteByPrimaryKey(id);
    }

    @DeleteMapping(value = "/checkOutById")
    public void checkOutById(@RequestParam(name = "id", required = false) int id){
        houseService.checkOutById(id);
        houseService.checkOutById2(id);
    }

    @GetMapping(value = "/statistics")
    public Object statistics(@RequestParam("startDate")  String startDate,
                                     @RequestParam("endDate")  String endDate){
        return houseService.statistics(startDate,endDate);
    }
    @PutMapping(value="updateByPrimaryKeySelective")
    public Integer updateByPrimaryKeySelective(@RequestBody House record){
        return houseService.updateByPrimaryKeySelective(record);
    }

}

