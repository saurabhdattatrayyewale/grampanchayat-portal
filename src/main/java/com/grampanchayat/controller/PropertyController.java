package com.grampanchayat.controller;

import com.grampanchayat.model.Property;
import com.grampanchayat.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {
    @Autowired
    private PropertyService service;

    @PostMapping("/add")
    public Property add(@RequestBody Property p) { return service.save(p); }

    @GetMapping("/all")
    public List<Property> all() { return service.list(); }
}
