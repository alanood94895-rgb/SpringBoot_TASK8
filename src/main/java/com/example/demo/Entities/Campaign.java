package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Campaign extends ParentEntity {
    private String campaignName;
    private String platform;
    private Double budget;
    @OneToOne
    Employee employee;
}