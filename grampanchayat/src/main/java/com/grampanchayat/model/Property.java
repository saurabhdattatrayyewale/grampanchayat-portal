package com.grampanchayat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "properties")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String propertyType;
    private String address;
    private Double sizeSqft;

    @ManyToOne
    private Resident resident;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPropertyType() { return propertyType; }
    public void setPropertyType(String propertyType) { this.propertyType = propertyType; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Double getSizeSqft() { return sizeSqft; }
    public void setSizeSqft(Double sizeSqft) { this.sizeSqft = sizeSqft; }

    public Resident getResident() { return resident; }
    public void setResident(Resident resident) { this.resident = resident; }
}
