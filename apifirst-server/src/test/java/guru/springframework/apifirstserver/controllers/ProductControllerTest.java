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
public class ProductControllerTest extends BaseTest {

	@DisplayName("Test GET Product by Id")
	@Test
	void testGetProductById() throws Exception {
		mockMvc.perform(get(ProductController.BASE_URL + "/{productId}", testProduct.getId())
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(testProduct.getId().toString()));
	}

	@DisplayName("Test List Products")
	@Test
	void testListProducts() throws Exception {
		mockMvc.perform(get(ProductController.BASE_URL)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.length()", greaterThan(0)));
	}
}
