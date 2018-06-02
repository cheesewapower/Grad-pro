package com.example.demo.controller;

import com.example.demo.entity.Buyer;
import com.example.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buyer")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @GetMapping(value = "/queryAllByType")
    public Object queryAllByType(@RequestParam("pageNum") int pageNum,
                                 @RequestParam("pageSize") int pageSize,
                                 @RequestParam("buytype") int buytype) {
        return buyerService.queryAllByType(pageNum, pageSize, buytype);
    }

    @DeleteMapping(value = "/deleteByPrimaryKey")
    public Integer deleteByPrimaryKey(@RequestParam(name = "id", required = false) int id) {
        return buyerService.deleteByPrimaryKey(id);
    }

    @PostMapping(value = "/insert")
    public Integer insert(@RequestBody Buyer buyer) {
        return buyerService.insert(buyer);
    }

    @PutMapping(value = "/updateByPrimaryKeySelective")
    public Integer updateByPrimaryKeySelective(@RequestBody Buyer record){
        return buyerService.updateByPrimaryKeySelective(record);
            }
}
