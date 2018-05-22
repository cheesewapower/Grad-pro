package com.example.demo;

import com.example.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
