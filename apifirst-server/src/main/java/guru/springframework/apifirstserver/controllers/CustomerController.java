package guru.springframework.apifirstserver.controllers;

import com.reminetworks.apifirst.model.Customer;
import guru.springframework.apifirstserver.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static guru.springframework.apifirstserver.controllers.CustomerController.*;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(BASE_URL)
public class CustomerController {

	public static final String BASE_URL = "/v1/customers";

	private final CustomerService customerService;

	@GetMapping
	public ResponseEntity<List<Customer>> listCustomers() {
		return ResponseEntity.ok(customerService.listCustomers());
	}

	@GetMapping("/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") UUID customerId) {
		return ResponseEntity.ok(customerService.getCustomerById(customerId));
	}
}
