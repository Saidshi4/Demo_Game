package concrete;

import abstracts.CustomerCheckService;
import adapters.KPS;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    private final CustomerCheckService customerCheckService;
    public CustomerCheckManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public boolean checkCustomer(Customer customer) {
        return customerCheckService.checkCustomer(customer);
    }
}
