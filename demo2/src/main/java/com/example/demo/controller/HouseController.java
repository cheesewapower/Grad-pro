package com.example.demo.controller;

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

    @DeleteMapping(value = "/deleteByPrimaryKey")
    public Integer deleteByPrimaryKey(@RequestParam(name = "id", required = false) int id){
        return houseService.deleteByPrimaryKey(id);
    }
}

