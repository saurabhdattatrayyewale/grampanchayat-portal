package com.grampanchayat.service;

import com.grampanchayat.model.HouseBill;
import com.grampanchayat.repository.HouseBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseBillService {
    @Autowired
    private HouseBillRepository repo;
    public HouseBill save(HouseBill b) { return repo.save(b); }
    public List<HouseBill> list() { return repo.findAll(); }
}
