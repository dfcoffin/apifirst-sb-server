package guru.springframework.apifirstserver.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
@SpringBootTest
public class CustomerControllerTest extends BaseTest {

	@DisplayName("Test GET Customer by Id")
	@Test
	void testGetCustomerById() throws Exception {
		mockMvc.perform(get(CustomerController.BASE_URL + "/{customerId}", testCustomer.getId())
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(testCustomer.getId().toString()));
	}

	@DisplayName("Test List Customers")
	@Test
	void testListCustomers() throws Exception {
		mockMvc.perform(get(CustomerController.BASE_URL)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.length()", greaterThan(0)));
	}
}
