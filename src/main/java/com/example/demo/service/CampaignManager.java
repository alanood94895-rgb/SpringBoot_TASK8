package com.example.demo.service;

import com.example.demo.Entities.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager {
    private List<Campaign> campaigns = new ArrayList<>();

    public CampaignManager() {
        campaigns.add(new Campaign("C101", "Summer Sale", "Instagram", 500));
        campaigns.add(new Campaign("C102", "Black Friday", "Google Ads", 1000));
        campaigns.add(new Campaign("C103", "Email Promo", "Email", 300));
    }

    public String addCampaign(Campaign campaign) {

        for (Campaign existingCampaign : campaigns) {

            if (existingCampaign.getCampaignId()
                    .equals(campaign.getCampaignId())) {

                return "Campaign ID already exists\n" + "No campaign was created";
            }
        }

        campaigns.add(campaign);

        return "Campaign Created Successfully\n" +
                "Campaign ID: " + campaign.getCampaignId() + "\n" +
                "Campaign Name: " + campaign.getCampaignName() + "\n" +
                "Platform: " + campaign.getPlatform() + "\n" +
                "Budget: " + campaign.getBudget() + "\n" +
                "Status: Active";
    }

    public void displayCampaigns() {

        for (Campaign campaign : campaigns) {
            System.out.println(campaign);
        }
    }
    public List<Campaign> getAllCampaigns() {
        return campaigns;
    }

}
