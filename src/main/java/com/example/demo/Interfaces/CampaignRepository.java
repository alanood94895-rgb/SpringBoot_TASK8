package com.example.demo.Interfaces;

import com.example.demo.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<campaign,String> {
}
