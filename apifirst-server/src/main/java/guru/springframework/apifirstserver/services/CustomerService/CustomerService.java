package guru.springframework.apifirstserver.services.CustomerService;

import com.reminetworks.apifirst.model.Customer;

import java.util.List;
import java.util.UUID;

/**
 * @author Donald F. Coffin, Green Button Alliance, Inc.
 **/
public interface CustomerService {
	List<Customer> listCustomers();

	Customer getCustomerById(UUID customerId);
}
