package abstracts;

import entities.Customer;

public abstract class CustomerManagerService {
    public void register(Customer customer) throws Exception {
        System.out.println(customer.getName() + " added.");
    };
    public void delete(Customer customer){
        System.out.println(customer.getName() + " deleted.");
    };
    public void update(Customer customer){
        System.out.println(customer.getName() + " updated.");
    };


}
