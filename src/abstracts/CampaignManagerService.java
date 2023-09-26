package abstracts;

import entities.Campaign;

public abstract class CampaignManagerService {
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + " added.");
    };
    public void delete(Campaign campaign){
        System.out.println(campaign.getName() + " deleted.");
    };
    public void update(Campaign campaign){
        System.out.println(campaign.getName() + " updated.");
    };
}
