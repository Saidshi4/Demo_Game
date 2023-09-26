package entities;

public class Campaign {
    private String name;
    private double campaignPercent;

    public Campaign(String name, double campaignPercent) {
        this.name = name;
        this.campaignPercent = campaignPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCampaignPercent() {
        return campaignPercent;
    }

    public void setCampaignPercent(double campaignPercent) {
        this.campaignPercent = campaignPercent;
    }
}
