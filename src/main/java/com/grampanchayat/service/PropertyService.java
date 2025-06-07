package com.grampanchayat.service;

import com.grampanchayat.model.Property;
import com.grampanchayat.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository repo;
    public Property save(Property p) { return repo.save(p); }
    public List<Property> list() { return repo.findAll(); }
}
