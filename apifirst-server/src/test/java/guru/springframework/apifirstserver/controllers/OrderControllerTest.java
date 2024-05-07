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
public class OrderControllerTest extends BaseTest {

	@DisplayName("Test GET Order by Id")
	@Test
	void testGetProductById() throws Exception {
		mockMvc.perform(get(OrderController.BASE_URL + "/{orderId}", testOrder.getId())
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(testOrder.getId().toString()));
	}

	@DisplayName("Test List Orders")
	@Test
	void testListProducts() throws Exception {
		mockMvc.perform(get(OrderController.BASE_URL)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.length()", greaterThan(0)));
	}
}
