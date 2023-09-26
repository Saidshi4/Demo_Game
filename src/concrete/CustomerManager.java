package concrete;

import abstracts.CustomerManagerService;
import entities.Customer;

public class CustomerManager extends CustomerManagerService {
    private final CustomerCheckManager customerCheckManager;

    public CustomerManager(CustomerCheckManager customerCheckManager) {
        this.customerCheckManager = customerCheckManager;
    }

    @Override
    public void register(Customer customer) throws Exception {
        if(customerCheckManager.checkCustomer(customer)){
            super.register(customer);
        }
        else throw new Exception("Customer is not valid");
    }

    @Override
    public void delete(Customer customer) {
        super.delete(customer);
    }

    @Override
    public void update(Customer customer) {
        super.update(customer);
    }
}
