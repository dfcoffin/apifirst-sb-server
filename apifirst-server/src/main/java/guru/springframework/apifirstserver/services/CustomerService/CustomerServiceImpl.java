package guru.springframework.apifirstserver.services.CustomerService;

import com.reminetworks.apifirst.model.Customer;
import guru.springframework.apifirstserver.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

/**
 * @author Donald F. Coffin, Green Button Alliance, Inc.
 **/
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;

	@Override
	public List<Customer> listCustomers() {
		return StreamSupport.stream(customerRepository.findAll().spliterator(), false)
				.toList();
	}

	@Override
	public Customer getCustomerById(UUID customerId) {
		return customerRepository.findById(customerId).orElseThrow();
	}
}
