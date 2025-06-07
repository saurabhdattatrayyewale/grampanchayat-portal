package com.grampanchayat.service;

import com.grampanchayat.model.Resident;
import com.grampanchayat.repository.ResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentService {
    @Autowired
    private ResidentRepository repo;
    public Resident save(Resident r) { return repo.save(r); }
    public List<Resident> list() { return repo.findAll(); }
}
