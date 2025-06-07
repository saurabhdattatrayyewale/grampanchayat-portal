package com.grampanchayat.repository;

import com.grampanchayat.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Long> {
}

