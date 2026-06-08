package com.example.demo.Entities;

public class Campaign {
    private String campaignId;
    private String campaignName;
    private String platform;
    private double budget;

    public Campaign(String campaignId, String campaignName,
                    String platform, double budget) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public String getPlatform() {
        return platform;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return campaignId + " -> " + campaignName +
                " -> " + platform + " -> " + budget;
    }

}
