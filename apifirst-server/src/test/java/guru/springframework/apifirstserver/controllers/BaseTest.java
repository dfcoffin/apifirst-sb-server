package guru.springframework.apifirstserver.controllers;

import com.reminetworks.apifirst.model.Customer;
import com.reminetworks.apifirst.model.Order;
import com.reminetworks.apifirst.model.Product;
import guru.springframework.apifirstserver.repositories.CustomerRepository;
import guru.springframework.apifirstserver.repositories.OrderRepository;
import guru.springframework.apifirstserver.repositories.ProductRepository;
import jakarta.servlet.Filter;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
public class BaseTest {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	WebApplicationContext wac;

	@Autowired
	Filter validationFilter;

	public MockMvc mockMvc;

	Customer testCustomer;
	Product testProduct;
	Order testOrder;

	@BeforeEach
	void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac)
				.addFilter(validationFilter)
				.build();

		testCustomer = customerRepository.findAll().iterator().next();

		testProduct = productRepository.findAll().iterator().next();

		testOrder = orderRepository.findAll().iterator().next();
	}
}
