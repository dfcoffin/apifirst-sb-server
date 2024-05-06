package guru.springframework.apifirstserver.controllers;

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
	CustomerController customerController;

	@Autowired
	ProductController productController;

	@Autowired
	OrderController orderController;

	@Autowired
	WebApplicationContext wac;

	public MockMvc mockMvc;

	@BeforeEach
	void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
}
