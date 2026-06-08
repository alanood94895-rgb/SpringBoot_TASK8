package com.example.demo.Controller;

import com.example.demo.Entities.Campaign;
import com.example.demo.service.CampaignManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CampaignController {
    @Autowired
    private CampaignManager campaignManager;

    @GetMapping("/campaigns")
    public List<Campaign> getCampaigns() {
        return campaignManager.getAllCampaigns();
    }

    @PostMapping("/campaigns")
    public String createCampaign(@RequestBody Campaign campaign) {
        return campaignManager.addCampaign(campaign);
    }
}
