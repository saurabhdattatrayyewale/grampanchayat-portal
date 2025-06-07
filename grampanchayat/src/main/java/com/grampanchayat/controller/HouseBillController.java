package com.grampanchayat.controller;

import com.grampanchayat.model.HouseBill;
import com.grampanchayat.service.HouseBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class HouseBillController {
    @Autowired
    private HouseBillService service;

    @PostMapping("/add")
    public HouseBill add(@RequestBody HouseBill b) { return service.save(b); }

    @GetMapping("/all")
    public List<HouseBill> all() { return service.list(); }
}
