package com.example.demo;

import com.example.demo.Entities.Campaign;
import com.example.demo.service.CampaignManager;

public class MarketingDemo {
    public static void main(String[] args) {

        CampaignManager manager = new CampaignManager();

        System.out.println("Existing Campaigns");
        manager.displayCampaigns();

        Campaign newCampaign = new Campaign("C104", "Ramadan Offer", "Facebook Ads", 700);
        System.out.println("\nPOST Operation");
        System.out.println(manager.addCampaign(newCampaign));

        System.out.println("\nUpdated Campaign List");
        manager.displayCampaigns();
    }
}
