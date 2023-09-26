package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;

public class KPS implements CustomerCheckService {
    @Override
    public boolean checkCustomer(Customer customer){
        return customer.getName().equals("Said") && customer.getYearOfBirth() == 2004;
    }
}
