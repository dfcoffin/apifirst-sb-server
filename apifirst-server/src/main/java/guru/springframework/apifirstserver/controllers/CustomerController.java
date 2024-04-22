package guru.springframework.apifirstserver.controllers;

import com.reminetworks.apifirst.model.Customer;
import guru.springframework.apifirstserver.services.CustomerService.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static guru.springframework.apifirstserver.controllers.CustomerController.*;

/**
 * @author Donald F. Coffin, Green Button Alliance, Inc.
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
}
