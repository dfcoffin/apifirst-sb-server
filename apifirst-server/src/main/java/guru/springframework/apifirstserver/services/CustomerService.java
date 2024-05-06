package guru.springframework.apifirstserver.services;

import com.reminetworks.apifirst.model.Customer;

import java.util.List;
import java.util.UUID;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
public interface CustomerService {
	List<Customer> listCustomers();

	Customer getCustomerById(UUID customerId);
}
