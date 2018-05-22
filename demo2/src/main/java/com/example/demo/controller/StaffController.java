package com.example.demo.controller;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(value = "/getUserByUserName", method = RequestMethod.GET)
    public Staff getUserByUserName(@RequestParam(name = "id", required = false) int id) {
        Staff data = staffService.selectByPrimaryKey(id);
        return data;
    }

    @GetMapping(value = "/findAllByPage")
    public Object findAllByPage(@RequestParam("pageNum") int pageNum,
                                @RequestParam("pageSize") int pageSize){
        return staffService.queryAllByPage(pageNum,pageSize);
    }
}

