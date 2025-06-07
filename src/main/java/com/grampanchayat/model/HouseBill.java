package com.grampanchayat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "house_bills")
public class HouseBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String billType;
    private Double amount;
    private String dueDate;
    private Boolean paid = false;

    @ManyToOne
    private Property property;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBillType() { return billType; }
    public void setBillType(String billType) { this.billType = billType; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public Boolean getPaid() { return paid; }
    public void setPaid(Boolean paid) { this.paid = paid; }

    public Property getProperty() { return property; }
    public void setProperty(Property property) { this.property = property; }
}
