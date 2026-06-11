package com.example.demo.Interfaces;

import com.example.demo.Entities.Campaign;
import com.example.demo.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign,Integer> {

    @Query("SELECT c FROM Campaign c WHERE c.isActive=true ")
    List<Campaign> getAll();

    @Query("SELECT c FROM Campaign c WHERE c.isActive=true and c.id=:id")
    Campaign getById(@Param("id") Integer id);

    @Query("SELECT c FROM Campaign c WHERE c.isActive=true and c.campaignName=:campaignName")
    Campaign getByName(@Param("campaignName") String campaignName);
}