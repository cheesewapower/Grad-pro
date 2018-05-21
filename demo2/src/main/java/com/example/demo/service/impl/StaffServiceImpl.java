package com.example.demo.service.impl;

import com.example.demo.mapper.StaffMapper;
import com.example.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StaffServiceImpl implements StaffService{
    @Autowired
    private StaffMapper staffMapper;

}
