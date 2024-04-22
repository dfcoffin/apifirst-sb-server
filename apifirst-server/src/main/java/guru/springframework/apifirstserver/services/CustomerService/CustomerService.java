package guru.springframework.apifirstserver.services.CustomerService;

import com.reminetworks.apifirst.model.Customer;

import java.util.List;

/**
 * @author Donald F. Coffin, Green Button Alliance, Inc.
 **/
public interface CustomerService {
	List<Customer> listCustomers();
}
