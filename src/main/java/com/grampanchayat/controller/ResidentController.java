package com.grampanchayat.controller;

import com.grampanchayat.model.Resident;
import com.grampanchayat.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/residents")
public class ResidentController {
    @Autowired
    private ResidentService service;

    @PostMapping("/add")
    public Resident add(@RequestBody Resident r) { return service.save(r); }

    @GetMapping("/all")
    public List<Resident> all() { return service.list(); }
}
