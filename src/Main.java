import adapters.KPS;
import concrete.CampaignManager;
import concrete.CustomerCheckManager;
import concrete.CustomerManager;
import concrete.GameManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(1, "Said", "Gulizada", 2004, 123456);
        Game game = new Game(123, "LOL", 22.5);
        Campaign campaign = new Campaign("Ramazan holiday", 45.0);

        CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(new KPS()));
        GameManager gameManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();



        customerManager.register(customer);
        System.out.println("--------------------------");
        campaignManager.add(campaign);
        System.out.println("--------------------------");
        gameManager.buy(customer,game,campaign);

    }
}