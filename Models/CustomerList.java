package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jprod
 */
public class CustomerList {
    private final List<Customer> customerList;

    public CustomerList() {
        customerList = new ArrayList<>();
    }

    public boolean add(Customer customer){
        Customer current = get(customer);
        if(current!=null)
            return false;
        customerList.add(customer);
        return true;
    }

    public Customer get(Customer customer) {
        for (Customer current : customerList) {
            if (current.getId() == customer.getId()) {
                return current;
            }
        }
        return null;
    }

    public boolean set(Customer customer){
        if (customer != null) {
            Customer current=get(customer);
            if (current != null){
                customerList.remove(current);
                customerList.add(customer);
                return true;
            }
        }
        return false;
    }
    
    public boolean remove(Customer customer) {
        if (customer != null && get(customer)!=null) {
            customerList.remove(customer);
            return true;
        }
        return false;
    }

    public List getAll() {
        if (customerList.isEmpty()) {
            return null;
        }
        return customerList;
    }
    
}
