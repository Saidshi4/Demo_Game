package concrete;

import entities.Campaign;
import entities.Customer;
import entities.Game;

public class GameManager{
    public void buy(Customer customer, Game game, Campaign campaign) {
       System.out.println(customer.getName() + " bought " + game.getName() + " for " + game.getPrice()*(100 - campaign.getCampaignPercent())/100 + " with " + campaign.getName() + " campaign");
    }
}

